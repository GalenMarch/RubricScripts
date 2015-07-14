package rubricscripts;


public class QuestionStructInt {
    
    String title;
    int score;
    
    public QuestionStructInt(String title, int score)  {
        this.title = title;
        this.score = score;
    }
    
    public String returnTitle() {
        return title;
    }
    
    public int returnScore() {
        return score;
    }
     
    public void setScore(int integer) {
        score = integer;
    }
    
    public boolean matchHuh(String string) {
        if (title.equalsIgnoreCase(string)) {
            return true;
        } else 
            return false;
    }
      
    public String toString() {
        return ("Question: " + title + " ......... Score: " + score);
    }
}
