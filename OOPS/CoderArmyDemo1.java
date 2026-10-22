public class CoderArmyDemo1 {
    public static void main(String[] args) {
        Student s1 =new Student();
        
        //Default Values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        // Local Variable --> No default values
        int x ;
        System.out.println(x);
    }
}

// Default values of Data Types
// Integer --> 0;
// Floating --> 0.0;
// Boolean --> False
//  String --> Null

class Student{
    //Information/Data/Characteristic  --> Instance Variables
    String name; 
    int age;
    int rollNumber;
    String college;

    //Behaviours --> functions --> Instance Methods
    void markAttendence(){
        System.out.println("Attendence marked by : " + name);
    }
}