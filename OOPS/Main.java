public class Main {
    public static void main(String[] args) {
         Student s1 = new Student("radha",10 );

    s1.print();     
    }
}



class Student{
    String name;
    int roll;

    public Student(String n , int roll){
    this.name = n;
    this.roll = roll;
    }

    public void print(){
         System.out.println(name + " " + roll);      
    }

   
}