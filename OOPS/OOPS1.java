 

public class OOPS1 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //we have created a object called p1. 
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yello");
        p1.color = "Yello";
        System.out.println(p1.color);

        BankAccount myAccount = new BankAccount();
        myAccount.username = "Vishwajit Kumar Mishra";
        // myAccount.password = "hjdfyesfgweh"; 
        myAccount.setPassword("nshdfgsefdu");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen {
    // properties
    String color;
    int tip;

    //functions
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void setName(String newName){
        name = newName;
    }

    void calPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}
