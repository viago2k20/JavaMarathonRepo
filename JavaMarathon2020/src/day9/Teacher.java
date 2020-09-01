package day9;

public class Teacher extends Human {

    private String subject;

    //constructor
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    //getter and setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
