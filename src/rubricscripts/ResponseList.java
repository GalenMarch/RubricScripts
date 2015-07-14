package rubricscripts;
import java.util.LinkedList;


public class ResponseList {
    
    String level;
    LinkedList<String> responses;
    
    public ResponseList(String level, LinkedList<String> responses) {
        this.level = level;
        this.responses = responses;
    }
    
    public String returnLevel() {
        return level;
    }
    
    public LinkedList<String> returnResponses() {
        return responses;
    }
    
    public void setLevel(String string) {
        level = string;
    } 
    
    public void setResponsesElt(String string) {
        responses.add(string);
    }
    
    public boolean isElement(String string) {
        boolean answer = false;
        for (int i = 0; i < responses.size(); i++) {
            if (string.equals(responses.get(i))) {
                answer = true;
            } else answer = false;
        }
        return answer;
    }    
        
    private void levelToString() {
        System.out.println("Level: " + level + "\r"); 
    }
    
    private void responsesToString() { 
        System.out.println("RESPONSES: \r");
        for (int i = 0; i < responses.size(); i++) {
          System.out.println(responses.get(i) + "\r");
        }
        System.out.println();
    }    
    
    public void print() {  
      levelToString();
      responsesToString();
      System.out.println(responses.size()/53.0);
    }
}
