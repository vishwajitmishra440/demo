

public class CoderArmyConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Vishwajit");
        // Student s3 = new Student("Rohit", 21);
        // Student s4 = new Student("Ram" , 22, 102);
        // Student s5 = new Student("Raju", 20, 103,"SS College");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

// Constructor Chaining
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){
        // this.name ="Unknown";
        // this.age = 0;
        // this.rollNumber = 0;
        // this.college = "Unknown";
        this("Unknown");
        System.out.println("i am 1st constructor");
    }

    Student(String name){
        // this.name = name;
        this(name, 0);
        System.out.println("i am 2nd constructor");
    }

    
    Student(String name, int age){
        // this.name = name;
        // this.age = age;
        this(name, age, 0);
        System.out.println("i am 3rd constructor");
    }

    
    Student(String name, int age, int rollNumber){
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;
        this(name, age, rollNumber, "Unknown");
        System.out.println("i am 4th constructor");
    }

    
    Student(String name, int age, int rollNumber, String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("i am 5th constructor");
    }
}