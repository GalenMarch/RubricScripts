package rubricscripts;


public class QuestionStruct {
    
    String title, response;
    
    public QuestionStruct(String title, String response) {
        this.title = title;
        this.response = response;
    }
    
    public String returnTitle() {
        return title;
    }
    
    public String returnResponse() {
        return response;
    }
    
    public void setTitle(String string) {
        title = string;
    }
    
    public void setResponse(String string) {
        response = string;
    }
    
    public String toString() {
        return (title + ": " + response);
    }
    
    public QuestionStructInt convert() {
        return new QuestionStructInt(title,0);
    }
}
