package day9;

public class Student extends Human {
    private String studyGroup;

    //constructor
    public Student(String name, String studyGroup) {
        super(name);
        this.studyGroup = studyGroup;
    }

    //getter and setter
     public String getStudyGroup(){
        return studyGroup;
     }
     public void setStudyGroup(String studyGroup){
        this.studyGroup = studyGroup;
     }

     public void printInfo(){
         super.printInfo();
         System.out.println("Этот студент с именем " + getName());

     }
}
