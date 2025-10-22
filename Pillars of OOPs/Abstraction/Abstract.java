package Abstraction;

abstract class Bank{
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract void checkBalance();
    
    void Connecttobank(){
        System.out.println("Connecting to the bank");
    }
}

class SBI extends Bank{
    
    private double balance = 1000;
    @Override
    void withdraw(double amount){
        if(balance >= amount) {
            balance -= amount;
            System.out.println("WithDraw successful for amount "+ amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    @Override
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit Successful");
        }else{
            System.out.println("Enter valid amount");
        }
    }

    void checkBalance(){
        System.out.println("The Available Balance is "+ balance );
    }
}


class Canara extends Bank{
    
    private double balance = 100000;
    @Override
    void withdraw(double amount){
        if(balance >= amount) {
            balance -= amount;
            System.out.println("WithDraw successful for amount "+ amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    @Override
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit Successful");
        }else{
            System.out.println("Enter valid amount");
        }
    }

    void checkBalance(){
        System.out.println("The Available Balance is "+ balance );
    }
}

public class Abstract {
    public static void main(String[] vk){
        Bank b;

        b = new SBI();
        b.Connecttobank();
        b.deposit(15000);
        b.checkBalance();
        b.withdraw(2000);
        b.checkBalance();

        System.out.println("----------------------------------------------");

        b = new Canara();
        b.Connecttobank();
        b.checkBalance();
        b.deposit(15000);
        b.withdraw(25000);
        b.checkBalance();
    }
}
