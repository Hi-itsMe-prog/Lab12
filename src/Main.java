public class Main {
    public static void main(String[] args) {
        User teacher1 = new Teacher("John Smith", 45, "Associate Professor", "john_smith", "teach123");
        User teacher2 = new Teacher("Mary Johnson", 50, "Professor", "mary_johnson", "teach456");

        User student1 = new Student("Alex Brown", 20, "Student", "alex_brown", "student123");
        User student2 = new Student("Anna Green", 21, "Student", "anna_green", "student456");

        teacher1.PrintPass();
        teacher1.PrintLog();
        teacher2.PrintPass();
        teacher2.PrintLog();

        student1.PrintPass();
        student1.PrintLog();
        student2.PrintPass();
        student2.PrintLog();
    }
}

interface User {
    void PrintLog();
    void PrintPass();
}

abstract class People implements User {
    public String name;
    public int age;
    public String position;
    public String log;
    public String pass;

    public People(String name, int age, String position, String log, String pass) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.log = log;
        this.pass = pass;
    }

    @Override
    public void PrintLog() {
        System.out.println("The " + this.name + "'s login is " + this.log);
    }

    @Override
    public void PrintPass() {
        System.out.println("The " + this.name + "'s password is " + this.pass);
    }
}

class Teacher extends People {
    public Teacher(String name, int age, String position, String log, String pass) {
        super(name, age, position, log, pass);
    }
}

class Student extends People {
    public Student(String name, int age, String position, String log, String pass) {
        super(name, age, position, log, pass);
    }
}