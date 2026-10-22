public class Inheritance {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        Student s1 = new Student();
        s1.markAttendance();
        // s1.attendLab();  (wrong)
    }
}

// parent (Superclass) --> child(Subclass)

class Student{ //Parent Class
    String name;
    int age;


    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student{ //Child Class
    void attendLab(){
        System.out.println("Lab attended");
    }
}
