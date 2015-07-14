package rubricscripts;
import java.util.Arrays;

public class DataStruct {
    
    
    // The app name and level of inquiry is stored in these strings
    String name, level;
    
        
    QuestionStruct Random = new QuestionStruct("Random", ""); 
    QuestionStruct AcademicValue = new QuestionStruct("Academic Value", "");
    QuestionStruct InstructionPage = new QuestionStruct("Instruction Page", "");
    QuestionStruct MediaOptions = new QuestionStruct("Media Options", "");
    QuestionStruct UniqueCapabilities = new QuestionStruct("Unique Capabilities", "");
    QuestionStruct LiteraryQuality = new QuestionStruct("Literary Quality", "");
    QuestionStruct AppStoreRatings = new QuestionStruct("App Store Ratings", "");
    QuestionStruct Communication = new QuestionStruct("Communication", "");
    QuestionStruct Connecting = new QuestionStruct("Connecting", "");
    QuestionStruct Context = new QuestionStruct("Context", "");
    QuestionStruct Critique = new QuestionStruct("Critique", "");
    QuestionStruct Pacing = new QuestionStruct("Pacing", "");
    QuestionStruct Balance = new QuestionStruct("Balance", "");
    QuestionStruct ParentTeacherSupport = new QuestionStruct("Parent/Teacher Support", "");
    QuestionStruct GenderNeutral = new QuestionStruct("Gender Neutral", "");
    QuestionStruct TargetsSpeechLanguageSkills = new QuestionStruct("Targets Speech/Language Skills", "");
    QuestionStruct CulturalSensitivity = new QuestionStruct("Cultural Sensitivity", "");
    QuestionStruct Interactivity = new QuestionStruct("Interactivity", "");
    QuestionStruct Privacy = new QuestionStruct("Privacy", "");
    QuestionStruct Reliability = new QuestionStruct("Reliability", "");
    QuestionStruct QuickLoading = new QuestionStruct("Quick Loading", "");
    QuestionStruct InAppPurchases = new QuestionStruct("In-App Purchases", "");
    QuestionStruct SaveGameCapabilities = new QuestionStruct("Save-Game Capabilities", "");
    QuestionStruct ExtendedAppeal = new QuestionStruct("Extended Appeal", "");
    QuestionStruct AdFree = new QuestionStruct("Ad-Free", "");
    QuestionStruct Price = new QuestionStruct("Price", "");
    QuestionStruct Accuracy = new QuestionStruct("Accuracy", "");
    QuestionStruct MultipleModalities = new QuestionStruct("Multiple Modalities", "");
    QuestionStruct Creativity = new QuestionStruct("Creativity", "");
    QuestionStruct CurriculumRelevance = new QuestionStruct("Curriculum Relevance", "");
    QuestionStruct Customizability = new QuestionStruct("Customizability", "");
    QuestionStruct Feedback = new QuestionStruct("Feedback", "");
    QuestionStruct ThinkingSkills = new QuestionStruct("Thinking Skills", "");
    QuestionStruct Usability = new QuestionStruct("Usability", "");
    QuestionStruct Engagement = new QuestionStruct("Engagement", "");
    QuestionStruct Sharing = new QuestionStruct("Sharing", "");
    QuestionStruct Authenticity = new QuestionStruct("Authenticity", ""); 
    QuestionStruct AgeAppropriate = new QuestionStruct("Age Appropriate", "");
    QuestionStruct Collaboration = new QuestionStruct("Collaboration", "");
    QuestionStruct Fluidity = new QuestionStruct("Fluidity", "");
    QuestionStruct SupportPage = new QuestionStruct("Support Page", "");
    QuestionStruct StudentData = new QuestionStruct("Student Data", "");
    QuestionStruct GraphicDesign = new QuestionStruct("Graphic Design", "");
    QuestionStruct SoundDesign = new QuestionStruct("Sound Design", "");
    QuestionStruct GeneralDesign = new QuestionStruct("General Design", "");
    QuestionStruct ResearchBased = new QuestionStruct("Research Based", "");
    QuestionStruct LevelsOfDifficulty = new QuestionStruct("Levels of Difficulty", "");
    QuestionStruct ConsistentUpdates = new QuestionStruct("Consistent Updates", "");
    QuestionStruct ClearDirections = new QuestionStruct("Clear Directions", "");
    QuestionStruct Multilingual = new QuestionStruct("Multilingual", "");
    QuestionStruct ExpandsResources = new QuestionStruct("Expands Resources", "");
    QuestionStruct LiteVersion = new QuestionStruct("Lite Version", "");
    QuestionStruct CreationSupport = new QuestionStruct("Creation Support", "");
    
    // The 53 QuestionStructs are stored in the data array
                   
    QuestionStruct[] data = {Random, 
                             AcademicValue, 
                             InstructionPage, 
                             MediaOptions,
                             UniqueCapabilities,
                             LiteraryQuality,
                             AppStoreRatings,
                             Communication,
                             Connecting,
                             Context,
                             Critique,
                             Pacing,
                             Balance,
                             ParentTeacherSupport,
                             GenderNeutral,
                             TargetsSpeechLanguageSkills,
                             CulturalSensitivity,
                             Interactivity,
                             Privacy,
                             Reliability,
                             QuickLoading,
                             InAppPurchases,
                             SaveGameCapabilities,
                             ExtendedAppeal,
                             AdFree,
                             Price,
                             Accuracy,
                             MultipleModalities,
                             Creativity,
                             CurriculumRelevance,
                             Customizability,
                             Feedback,
                             ThinkingSkills,
                             Usability,
                             Engagement,
                             Sharing,
                             Authenticity,
                             AgeAppropriate,
                             Collaboration,
                             Fluidity,
                             SupportPage,
                             StudentData,
                             GraphicDesign,
                             SoundDesign,
                             GeneralDesign,
                             ResearchBased,
                             LevelsOfDifficulty,
                             ConsistentUpdates,
                             ClearDirections,
                             Multilingual,
                             ExpandsResources,
                             LiteVersion,
                             CreationSupport}; 
                             
    
    public DataStruct(String name, String level) {
        this.name = name;
        this.level = level;
        this.data = data;
    }
    
//    public DataStruct initialize() {
//        return new DataStruct("", "");
//    }
    
    public String returnName() {
        return name;
    }
    
    public String returnLevel() {
        return level;
    }
    
    public QuestionStruct[] returnData() {
        return data;
    }
    
    public void setName(String string) {
        name = string;
    }
    
    public void setLevel(String string) {
        level = string;
    }
    
    public void setData(String string, int index) {
        data[index].setResponse(string);
    }
    public void nameAndLevelString() {
        System.out.println("App Name: " + name);
        System.out.println("Level: " + level);
        System.out.println();
    }
    
    public void dataToString() { 
        System.out.println("Data:");
        for (int i = 0; i < data.length; i++) {
        System.out.println(data[i].toString());
        }
        System.out.println();
        System.out.println();
    }  
    
    
    public void print() {  
      nameAndLevelString();
      dataToString();
    }
    
}
