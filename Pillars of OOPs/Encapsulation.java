class bankAcc{
    private String name;
    private double balance;
    
    public bankAcc(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    
     
    
    public String getName(){
        return name;
    } 
    
    public void setName(String name){
        this.name = name;
    }  
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    
    public double getBal(){
        return balance;
    }
}

public class Encapsulation{
   public static void main(String[] args){
        bankAcc acc = new bankAcc("vinoth",100);
        System.out.println(acc.getName());
        System.out.println(acc.getBal());
        acc.deposit(1506.01);
        System.out.println(acc.getBal());
   }
}