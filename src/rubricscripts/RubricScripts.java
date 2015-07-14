package rubricscripts;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException; 
import java.util.LinkedList;

public class RubricScripts {
    
   
    public static void main(String[] args) {
        

        String fileName = "C:\\Users\\JBA32\\Desktop\\Work\\Spreadsheets\\Responses.csv";
        File file = new File(fileName);
        LinkedList<String> completeList = new LinkedList(); 
        
        
        try {
            Scanner inputStream = new Scanner(file);
            Pattern pattern = Pattern.compile("(?<=[^,]),(?=\\S)");
            inputStream.useDelimiter(pattern);
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                data = data.replace(",","");
                data = data.replace(" ","");
                data = data.replace("\"","");
                Scanner s = new Scanner(data);
                while (s.hasNext()) {
                    String finalData = s.next();
                    if (!finalData.isEmpty()) {
                    completeList.add(finalData);
                }
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); 
        }
    
        // **********************************************************
        // printing out completeList
//        int length = completeList.size();
//        for (int i = 0; i < length; i++) {          
//            System.out.println(completeList.get(i));
//        }
        // **********************************************************
        

        // Creating dataStructArray
        
        int numAssessments = 128;
        DataStruct[] dataStructArray = new DataStruct[numAssessments];
        
        // Initializing the dataStructArray
        
        for (int i = 0; i < numAssessments; i++) {
            dataStructArray[i] = new DataStruct("","");
        }
        
        
        int counter = 54;  // 55-1
        int arrayLocation = 0;
        
        // This while loop places data into the DataStructs within the dataStructArray
        
        while (!completeList.isEmpty()) {
            
            String data = completeList.getFirst();
            
            switch(counter) {
                case 54: 
                    dataStructArray[arrayLocation].setName(data);
                    break;
                case 53:
                    dataStructArray[arrayLocation].setLevel(data);
                    break;
                case 0:
                    dataStructArray[arrayLocation].setData(data, 52 - counter);
                    counter = 55;
                    arrayLocation++;
                    break;
                default:
                    dataStructArray[arrayLocation].setData(data, 52 - counter);
                    break;      
            }
            counter--;
            completeList.removeFirst();
        }
        
        // ****************************************************************
        // Printing out dataStructArray
        
//        for (int i = 0; i < dataStructArray.length; i++) {
//            dataStructArray[i].print();
//        }
        
        // ****************************************************************
        
         // Getting data from the "Questions" file 
        
        String fileName2 = "C:\\Users\\JBA32\\Desktop\\Work\\Spreadsheets\\Questions.csv";
        File file2 = new File(fileName2);    
        
        LinkedList<String> temp = new LinkedList();
        
        try {
            Scanner inputStream = new Scanner(file2);
            Pattern pattern = Pattern.compile("(?<=[^,]),(?=\\S)");
            inputStream.useDelimiter(pattern);  
            while (inputStream.hasNext()) {
                String data = inputStream.next();
                data = data.replace(",","");
                data = data.replace(" ","");
                data = data.replace("\"","");
                Scanner s = new Scanner(data);
                while (s.hasNext()) {
                    String finalData = s.next();
                    if (!finalData.isEmpty()) {
                        temp.add(finalData);
                } 
            }
            }
            inputStream.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(); 
        }    
        
        // *************************************************************
        // printing out temp - unorganized string from questions file
//        
//        for (int r = 0; r < temp.size(); r++) {
//            System.out.println(temp.get(r));
//        }
//        System.out.println(temp.size()/53.0);
        // *************************************************************
        
                
        ResponseList Binary = new ResponseList("Binary", new LinkedList());                      
        ResponseList ThreeLevel = new ResponseList("Three Level", new LinkedList());    
        ResponseList FourLevel = new ResponseList("Four Level", new LinkedList());                              
        ResponseList FiveLevel = new ResponseList("Five Level", new LinkedList());
        
        
        ResponseList[] responseLists = {Binary, ThreeLevel, FourLevel, FiveLevel};
        
        int counter2 = 14;
        
        // Placing data from "Questions" into four ResponseList structs
        
        while (temp.size() > 0) {
            
            if (counter2 <= 14 && counter2 >= 10) {
                    responseLists[3].setResponsesElt(temp.getFirst());
                    temp.removeFirst();
            } else if (counter2 <= 9 && counter2 >= 6) {
                    responseLists[2].setResponsesElt(temp.getFirst());
                    temp.removeFirst();
            } else if (counter2 <= 5 && counter2 >= 3) {
                    responseLists[1].setResponsesElt(temp.getFirst());
                    temp.removeFirst();
            } else if (counter2 <= 2 && counter2 >= 1) {
                    responseLists[0].setResponsesElt(temp.getFirst());
                    temp.removeFirst();
            } else  if (counter2 == 0) {
                    counter2 = 15;
        }
            counter2--;
        }
        
        // ******************************************************
        // Printing out responseList
        
//        for (int i = 0; i < 4; i++) {
//            responseLists[i].print();
//        }
        // ******************************************************
        
        // Control variables
        
        int binaryLength = 53*2;
        int threeLevelLength = 53*3;
        int fourLevelLength = 53*4;
        int fiveLevelLength = 53*5;
        
        QuestionStructInt[] binaryInts = new QuestionStructInt[binaryLength];
        QuestionStructInt[] threeLevelInts = new QuestionStructInt[threeLevelLength];
        QuestionStructInt[] fourLevelInts = new QuestionStructInt[fourLevelLength];
        QuestionStructInt[] fiveLevelInts = new QuestionStructInt[fiveLevelLength];
        
        ResponseArrayInt binaryArray = new ResponseArrayInt("Binary", binaryInts);
        ResponseArrayInt threeLevelArray = new ResponseArrayInt("Three Level", threeLevelInts);
        ResponseArrayInt fourLevelArray = new ResponseArrayInt("Four Level", fourLevelInts);
        ResponseArrayInt fiveLevelArray = new ResponseArrayInt("Five Level", fiveLevelInts);
        
        int binaryCounter = 2;
        int threeLevelCounter = 3;
        int fourLevelCounter = 4;
        int fiveLevelCounter = 5;
        
        //creating four arrays with the scores corresponding to every string
        // in the responselists
        
        for (int i = 0; i < binaryLength; i++) {
            String curString = responseLists[0].responses.get(i);
            if (binaryCounter == 0) {
                binaryCounter = 2;
                binaryArray.data[i] = new QuestionStructInt(curString,binaryCounter);
            } else 
                binaryArray.data[i] = new QuestionStructInt(curString,binaryCounter);
                binaryCounter--;
        }
        
                
        for (int i = 0; i < threeLevelLength; i++) {
            String curString = responseLists[1].responses.get(i);
            if (threeLevelCounter == 0) {
                threeLevelCounter = 3;
                threeLevelArray.data[i] = new QuestionStructInt(curString,threeLevelCounter);
            } else 
                threeLevelArray.data[i] = new QuestionStructInt(curString,threeLevelCounter);
                threeLevelCounter--;
        }
        
               
        for (int i = 0; i < fourLevelLength; i++) {
            String curString = responseLists[2].responses.get(i);
            if (fourLevelCounter == 0) {
                fourLevelCounter = 4;
                fourLevelArray.data[i] = new QuestionStructInt(curString,fourLevelCounter);
            } else 
                fourLevelArray.data[i] = new QuestionStructInt(curString,fourLevelCounter);
                fourLevelCounter--;
        }
        
               
        for (int i = 0; i < fiveLevelLength; i++) {
            String curString = responseLists[3].responses.get(i);
            if (fiveLevelCounter == 0) {
                fiveLevelCounter = 5;
                fiveLevelArray.data[i] = new QuestionStructInt(curString,fiveLevelCounter);
            } else 
                fiveLevelArray.data[i] = new QuestionStructInt(curString,fiveLevelCounter);
                fiveLevelCounter--;
        }
        
        // ***************************************************************
        // Printing out all responses and their corresponding scores
//        
//        binaryArray.print();
//        threeLevelArray.print();
//        fourLevelArray.print();
//        fiveLevelArray.print();
        
        // ****************************************************************
        
        // creating the dataStructIntArray
        
        DataStructInt[] dataStructIntArray = new DataStructInt[128];
        
        // initializing the dataStructIntArray
        
        for (int i = 0; i < 128; i++) {
            dataStructIntArray[i] = new DataStructInt("","");
        }
        
        for (int i = 0; i < dataStructArray.length; i++) {
            
            DataStruct curStruct = dataStructArray[i];
            String curAppName = curStruct.name;
            String curLevel = curStruct.level;
            QuestionStruct[] curData = curStruct.data;
            
            DataStructInt curIntStruct = dataStructIntArray[i];
            curIntStruct.setName(curAppName); 
            curIntStruct.setLevel(curLevel);
            
            if (curLevel.equals("Binary")) {
                for (int a = 0; a < curData.length; a++) {
                    curIntStruct.setData(binaryArray.findResponse(curData[a].response),a);
                }
            } else if (curLevel.equals("ThreeLevel")) {
                for (int b = 0; b < curData.length; b++) {
                    curIntStruct.setData(threeLevelArray.findResponse(curData[b].response),b);
                }
            } else if (curLevel.equals("FourLevel")) {
                for (int c = 0; c < curData.length; c++) {
                    curIntStruct.setData(fourLevelArray.findResponse(curData[c].response),c);
                }
            } else if (curLevel.equals("FiveLevel")) {
                for (int d = 0; d < curData.length; d++) {
                    curIntStruct.setData(fiveLevelArray.findResponse(curData[d].response),d);
                }
            }
        }
        
        // *********************************************************
        // Printing out dataStructIntArray
//        int numNegatives = 0;
//         for (int i = 0; i < 128; i++) {
//             dataStructIntArray[i].print();
//             for (int a = 0; a < dataStructIntArray[i].data.length; a++) {
//                 if (dataStructIntArray[i].data[a].score == -1) {
//                     numNegatives++;
//                 }
//             }
//         }
//         
//         System.out.println("Number of mismatches: " + numNegatives);
        // *********************************************************
         
         // Exporting the data to four csv files - one for each level
         
         String binaryFile = "c:\\Users\\JBA32\\Desktop\\Binary.csv";
         String threeLevelFile = "c:\\Users\\JBA32\\Desktop\\ThreeLevel.csv";
         String fourLevelFile = "c:\\Users\\JBA32\\Desktop\\FourLevel.csv";
         String fiveLevelFile = "c:\\Users\\JBA32\\Desktop\\FiveLevel.csv";
         
         DataStructInt[] binaryScores = new DataStructInt[32];
         DataStructInt[] threeLevelScores = new DataStructInt[32];
         DataStructInt[] fourLevelScores = new DataStructInt[32];
         DataStructInt[] fiveLevelScores = new DataStructInt[32];
         
         for (int i = 0; i < dataStructIntArray.length; i++ ) {
             if (dataStructIntArray[i].level.equals("Binary")) {
                 binaryScores[i/4] = dataStructIntArray[i];
             } else if (dataStructIntArray[i].level.equals("ThreeLevel")) {
                 threeLevelScores[i/4] = dataStructIntArray[i] ;
             } else if (dataStructIntArray[i].level.equals("FourLevel")) {
                 fourLevelScores[i/4] = dataStructIntArray[i];
             } else
                 fiveLevelScores[i/4] = dataStructIntArray[i];
         }
         
         try {
             FileWriter writer = new FileWriter(binaryFile);
             writer.append(',');
             for (int i = 0; i < dataStructIntArray[0].data.length; i++) {
                 writer.append(dataStructArray[0].data[i].title);
                 writer.append(',');
                 if (i == dataStructIntArray[0].data.length-1) {
                     writer.append('\n');
                 }        
             }
             for (int a = 0; a < binaryScores.length; a++) {
                 writer.append(binaryScores[a].name);
                 writer.append(',');
                 writer.append(binaryScores[a].dataString());
                 writer.append('\n');
             }
             writer.flush();
             writer.close();
         }
         catch (IOException e) {
             e.printStackTrace();
         }
         
                  
         try {
             FileWriter writer = new FileWriter(threeLevelFile);
             writer.append(',');
             for (int i = 0; i < dataStructIntArray[0].data.length; i++) {
                 writer.append(dataStructArray[0].data[i].title);
                 writer.append(',');
                 if (i == dataStructIntArray[0].data.length-1) {
                     writer.append('\n');
                 }        
             }
             for (int a = 0; a < threeLevelScores.length; a++) {
                 writer.append(threeLevelScores[a].name);
                 writer.append(',');
                 writer.append(threeLevelScores[a].dataString());
                 writer.append('\n');
             }
             writer.flush();
             writer.close();
         }
         catch (IOException e) {
             e.printStackTrace();
         }
         
                  
         try {
             FileWriter writer = new FileWriter(fourLevelFile);
             writer.append(',');
             for (int i = 0; i < dataStructIntArray[0].data.length; i++) {
                 writer.append(dataStructArray[0].data[i].title);
                 writer.append(',');
                 if (i == dataStructIntArray[0].data.length-1) {
                     writer.append('\n');
                 }        
             }
             for (int a = 0; a < fourLevelScores.length; a++) {
                 writer.append(fourLevelScores[a].name);
                 writer.append(',');
                 writer.append(fourLevelScores[a].dataString());
                 writer.append('\n');
             }
             writer.flush();
             writer.close();
         }
         catch (IOException e) {
             e.printStackTrace();
         }
         
                  
         try {
             FileWriter writer = new FileWriter(fiveLevelFile);
             writer.append(',');
             for (int i = 0; i < dataStructIntArray[0].data.length; i++) {
                 writer.append(dataStructArray[0].data[i].title);
                 writer.append(',');
                 if (i == dataStructIntArray[0].data.length-1) {
                     writer.append('\n');
                 }        
             }
             for (int a = 0; a < fiveLevelScores.length; a++) {
                 writer.append(fiveLevelScores[a].name);
                 writer.append(',');
                 writer.append(fiveLevelScores[a].dataString());
                 writer.append('\n');
             }
             writer.flush();
             writer.close();
         }
         catch (IOException e) {
             e.printStackTrace();
         }
         

    }
     
    
}


    




