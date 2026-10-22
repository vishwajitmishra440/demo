 

public class CoderArmyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student("Vishwajit",21,101,"SS college");
        // Student s2 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;
    

    //this is default constructor for student s2.
    Student(){

    }


    //this is parameterized constructor for student s1.
    Student(String n , int a , int r , String c){
        name = n;
        age = a;
        rollNumber = r;
        college = c;
    }

    void markAttendance(){
        System.out.println("Attendance marked for student " + name);
    }
}
