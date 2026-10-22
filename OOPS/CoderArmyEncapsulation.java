// Encapsulation --> It is defined as the wrapping up of data/properties/attributes and methods/functions under a single unit.and it is also implenentes data hiding.
// (wrapping up means adding/combining).


public class CoderArmyEncapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        // ba.balance = 1000000.00;

        // System.out.println(ba.balance);

        ba.deposite(500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount{
    private double balance;

    public void deposite(int ammount) {
        balance += ammount;
    }

    public void withdraw(int ammount){
        balance -= ammount;
    }


    //Getters and Stters
    public double getBalance(){
        return balance;
    }
}



