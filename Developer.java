public class Developer {
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHour;

    public Developer(String platform,String interviewerName,int workingHour){
        this.platform=platform;
        this.interviewerName=interviewerName;
        this.workingHour=workingHour;
        developerName="";
    }

        public String getplatform(){
            return platform;
        }

        public String getinterviewerName(){
            return interviewerName;
        }

        public String getdeveloperName(){
            return developerName;
        }

        public void setdeveloperName(String developerName){
            this.developerName=developerName;
        }

        public int getworkingHour(){
            return workingHour;
        }

        public void display(){
            System.out.println("the platform is " +platform);
            System.out.println("the interviewer name is " +interviewerName);
            if(developerName != ""){
                System.out.println("the developer name is " +developerName);
            }
            System.out.println("the working hour is " +workingHour);
        }
}       