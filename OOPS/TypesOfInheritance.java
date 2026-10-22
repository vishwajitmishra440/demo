//types of inheritance
// Simple inheritance
// Multi-Level inheritance
// Hierarchical inheritance
// Multiple inheritance (not supported in java)

public class TypesOfInheritance {
    public static void main(String[] args) {
        CSEEngineeringStudent cs1 = new CSEEngineeringStudent();
    }
}

class Student{ //Parent Class
    String name;
    int age;


    void markAttendance(){ //Child Class
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student{ 
    void attendLab(){
        System.out.println("Lab attended");
    }
}

class CSEEngineeringStudent extends EngineeringStudent{ //Child Class of EngineeringStudent
    void attendCSELab(){
        System.out.println("CSE Lab attended");
    }
}


/*
Multi-Level
Student --> EngineeringStudent --> CSEEngineeringStudent
*/

/*
Hierrarcy
        A
      /   \
      B    C
*/

