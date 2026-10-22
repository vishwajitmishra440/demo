public class SuperKeyword {
    public static void main(String[] args) {
        // EngineeringStudent es = new EngineeringStudent();
        // es.age=28;
        // es.name="Aditya";
        // es.rollNumber=101;
        // es.college="IIT G";
        // es.print();

        EngineeringStudent es1 = new EngineeringStudent("IIT G");
        es1.print();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    int x;

    Student(){

    }
    Student(String name, int age,int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
    }

    void print(){
        System.out.println(name+","+age+","+rollNumber);
    }
}

class EngineeringStudent extends Student{
    String college;
    int x;

    EngineeringStudent(String college){
        this.college=college;
    }

    void print(){
        super.print();
        System.out.println(college);
    }
}
