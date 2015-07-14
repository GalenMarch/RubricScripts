package rubricscripts;


public class ResponseArrayInt {
    
    String level;
    QuestionStructInt[] data;
    
    public ResponseArrayInt(String level, QuestionStructInt[] data) {
        this.level = level;
        this.data = data;
    }
    
    public String returnLevel() {
        return level;
    }
    
    public QuestionStructInt[] returnResponses() {
        return data;
    }
    
    public boolean hasElement(String string) {
        boolean answer = false;
        for (int i = 0; i < data.length; i++) {
            if (string.equalsIgnoreCase(data[i].title)) {
                answer = true;
            } else answer = false;
        }
        return answer;
    } 
    
    public int findResponse(String string) {
        int answer = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].matchHuh(string)) {
                answer = data[i].score;
                break;
            } else 
                answer = -1;
        }
        return answer;
    }
        
    private void levelToString() {
        System.out.println("Level: " + level + "\r"); 
    }
    
    private void responsesToString() { 
        System.out.println("RESPONSES:");
        for (int i = 0; i < data.length; i++) {
          System.out.println(data[i].toString());
        }
        System.out.println();
    }    
    
    public void print() {  
      levelToString();
      responsesToString();
    }
}

