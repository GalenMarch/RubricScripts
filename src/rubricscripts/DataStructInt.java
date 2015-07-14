package rubricscripts;

public class DataStructInt {
    
    String name, level;
    
        
    QuestionStructInt Random = new QuestionStructInt("Random", 0); 
    QuestionStructInt AcademicValue = new QuestionStructInt("Academic Value", 0);
    QuestionStructInt InstructionPage = new QuestionStructInt("Instruction Page", 0);
    QuestionStructInt MediaOptions = new QuestionStructInt("Media Options", 0);
    QuestionStructInt UniqueCapabilities = new QuestionStructInt("Unique Capabilities", 0);
    QuestionStructInt LiteraryQuality = new QuestionStructInt("Literary Quality", 0);
    QuestionStructInt AppStoreRatings = new QuestionStructInt("App Store Ratings", 0);
    QuestionStructInt Communication = new QuestionStructInt("Communication", 0);
    QuestionStructInt Connecting = new QuestionStructInt("Connecting", 0);
    QuestionStructInt Context = new QuestionStructInt("Context", 0);
    QuestionStructInt Critique = new QuestionStructInt("Critique", 0);
    QuestionStructInt Pacing = new QuestionStructInt("Pacing", 0);
    QuestionStructInt Balance = new QuestionStructInt("Balance", 0);
    QuestionStructInt ParentTeacherSupport = new QuestionStructInt("Parent/Teacher Support", 0);
    QuestionStructInt GenderNeutral = new QuestionStructInt("Gender Neutral", 0);
    QuestionStructInt TargetsSpeechLanguageSkills = new QuestionStructInt("Targets Speech/Language Skills", 0);
    QuestionStructInt CulturalSensitivity = new QuestionStructInt("Cultural Sensitivity", 0);
    QuestionStructInt Interactivity = new QuestionStructInt("Interactivity", 0);
    QuestionStructInt Privacy = new QuestionStructInt("Privacy", 0);
    QuestionStructInt Reliability = new QuestionStructInt("Reliability", 0);
    QuestionStructInt QuickLoading = new QuestionStructInt("Quick Loading", 0);
    QuestionStructInt InAppPurchases = new QuestionStructInt("In-App Purchases", 0);
    QuestionStructInt SaveGameCapabilities = new QuestionStructInt("Save-Game Capabilities", 0);
    QuestionStructInt ExtendedAppeal = new QuestionStructInt("Extended Appeal", 0);
    QuestionStructInt AdFree = new QuestionStructInt("Ad-Free", 0);
    QuestionStructInt Price = new QuestionStructInt("Price", 0);
    QuestionStructInt Accuracy = new QuestionStructInt("Accuracy", 0);
    QuestionStructInt MultipleModalities = new QuestionStructInt("Multiple Modalities", 0);
    QuestionStructInt Creativity = new QuestionStructInt("Creativity", 0);
    QuestionStructInt CurriculumRelevance = new QuestionStructInt("Curriculum Relevance", 0);
    QuestionStructInt Customizability = new QuestionStructInt("Customizability", 0);
    QuestionStructInt Feedback = new QuestionStructInt("Feedback", 0);
    QuestionStructInt ThinkingSkills = new QuestionStructInt("Thinking Skills", 0);
    QuestionStructInt Usability = new QuestionStructInt("Usability", 0);
    QuestionStructInt Engagement = new QuestionStructInt("Engagement", 0);
    QuestionStructInt Sharing = new QuestionStructInt("Sharing", 0);
    QuestionStructInt Authenticity = new QuestionStructInt("Authenticity", 0); 
    QuestionStructInt AgeAppropriate = new QuestionStructInt("Age Appropriate", 0);
    QuestionStructInt Collaboration = new QuestionStructInt("Collaboration", 0);
    QuestionStructInt Fluidity = new QuestionStructInt("Fluidity", 0);
    QuestionStructInt SupportPage = new QuestionStructInt("Support Page", 0);
    QuestionStructInt StudentData = new QuestionStructInt("Student Data", 0);
    QuestionStructInt GraphicDesign = new QuestionStructInt("Graphic Design", 0);
    QuestionStructInt SoundDesign = new QuestionStructInt("Sound Design", 0);
    QuestionStructInt GeneralDesign = new QuestionStructInt("General Design", 0);
    QuestionStructInt ResearchBased = new QuestionStructInt("Research Based", 0);
    QuestionStructInt LevelsOfDifficulty = new QuestionStructInt("Levels of Difficulty", 0);
    QuestionStructInt ConsistentUpdates = new QuestionStructInt("Consistent Updates", 0);
    QuestionStructInt ClearDirections = new QuestionStructInt("Clear Directions", 0);
    QuestionStructInt Multilingual = new QuestionStructInt("Multilingual", 0);
    QuestionStructInt ExpandsResources = new QuestionStructInt("Expands Resources", 0);
    QuestionStructInt LiteVersion = new QuestionStructInt("Lite Version", 0);
    QuestionStructInt CreationSupport = new QuestionStructInt("Creation Support", 0);
    
    // The 53 QuestionStructs are stored in the data array
                   
    QuestionStructInt[] data = {Random, 
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
    
    public DataStructInt(String name, String level) {
        this.name = name;
        this.level = level;
        this.data = data;
    }
    
//    public DataStructInt initialize() {
//        return new DataStructInt("","");
//    }
    
    public String returnName() {
        return name;
    }
    
    public String returnLevel() {
        return level;
    }
    
    public QuestionStructInt[] returnData() {
        return data;
    }
    
    public void setName(String string) {
        name = string;
    }
    
    public void setLevel(String string) {
        level = string;
    }
    
    public void setData(int integer, int index) {
        data[index].setScore(integer);
    }
    
    public String dataString() {
        String answer = "";
        for (int i = 0; i < data.length; i++) {
            answer = (answer + data[i].score + ",");
        }
        return answer;
    }
    
    public String dataTitleString() {
        String answer = "";
        for (int i = 0; i < data.length; i++) {
            answer = (answer + data[i].title + ",");
        }
        return answer;
    }
    
    
       
    public void nameAndLevelString() {
        System.out.println("App Name: " + name);
        System.out.println("Level: " + level);
        System.out.println();
    }
    
    public void dataToString() { 
        System.out.println("Data:");
        for (int i = 0; i < 53; i++) {
        System.out.println(data[i]);
        }
        System.out.println();
        System.out.println();
    }  
    
    public void print() {  
      nameAndLevelString();
      dataToString();
    }
    
}

