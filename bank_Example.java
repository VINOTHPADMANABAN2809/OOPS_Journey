abstract class BankAccount{
    private String AccountHolderName;
    private int AccountNumber;
    private double Balance;
    private String city;
    
    BankAccount(String AccountHolderName, int AccountNumber, double Balance, String city){
        this.AccountHolderName=AccountHolderName;
        this.AccountNumber=AccountNumber;
        this.Balance = Balance;
        this.city = city;
    }


   


public String getAccountHolderName(){
    return AccountHolderName;
}

public void SetAccountHolderName(String AccountHolderName){
    this.AccountHolderName=AccountHolderName;
}

public long getAccountNumber(){
    return AccountNumber;
}

public void setAccountNumber(int AccountNumber){
    this.AccountNumber=AccountNumber;
}

public double getBalance(){
    return Balance;
}

public void SetBalance( double Balance){
    this.Balance=Balance;
}

public String getcity(){
    return city;
}

public void Setcity(String city){
    this.city=city;
}


public void deposit(double amount){
    if(amount>0){
        Balance += amount;
        System.out.println("Deposited amount : " + amount);
    }
    else{
        System.out.println("Invalid amount ");
    }
}

public void withdraw(double amount){
    if(amount>0 && amount<=Balance){
        Balance -= amount;
        System.out.println("withdraw amount : " + amount);
    }
    else{
        System.out.println("Insufficient Balance ");
    }
}

public void displayDetails(){
        System.out.println("Savings Account :");
        System.out.println("Account Holder Name : " + getAccountHolderName());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Account Balance : " + getBalance());
        System.out.println("City: "+getcity());
    }

}


class savingsAccount extends BankAccount{
    public savingsAccount(String AccountHolderName, int AccountNumber, double Balance, String city){
        super(AccountHolderName,AccountNumber,Balance,city);
    }
    
        
}

public class bank_Example{
    public static void main(String[] args){
        
        savingsAccount savings = new savingsAccount("Vinoth Kumar M P",3262,1000000.00,"Tiruppur");
        savings.deposit(200000.00);
        savings.withdraw(500000.00);
        savings.displayDetails();
    }
}