import java.util.*;
abstract class hospital{
    private String patientName;
    private int age;
    private String city;
    hospital(String patientName,int age,String city){
        this.patientName=patientName;
        this.age=age;
        this.city=city;
    }
    public String getpatientName(){
        return patientName;
    }
    public void SetpatientName(String patientName){
        this.patientName=patientName;
    }
    public int getage(){
        return age;
    }
    public void Setage(int age){
        this.age=age;
    }
    public String getcity(){
        return city;
    }
    public void Setcity(String city){
        this.city=city;
    }
    public void diagnosis(String doc,String d){
        System.out.println(d+" is diagnosised by "+doc);
    }
    public void bill(double doctorfee,double pharmacyfee){
        double a=doctorfee+pharmacyfee;
        System.out.println("Total bill need to pay is :"+a);
    }
    public void displayDetails(){
        System.out.println("patient Account :");
        System.out.println("Patient Name : " + getpatientName());
        System.out.println("Patient age : " + getage());
        System.out.println("patient city :"+getcity());
    }
}
    class patientAccount extends hospital{
    public patientAccount(String patientName, int age,String city){
        super(patientName,age,city);
    }
}
public class Hospital_Example{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Patient details : Name,Age,City:");
        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String city=sc.nextLine();
        patientAccount acc = new patientAccount(name,age,city);
        System.out.println("Enter Doctor Name: with qualification md or mbbs:");
        String doc=sc.nextLine();
        System.out.println("Enter diagnosis:");
        String d=sc.nextLine();
        double df=0;
        String arr[]=doc.split(" ");
        if((arr[arr.length-1]).equals("MD")||(arr[arr.length-1]).equals("md"))
        df=1000;
        else
        df=500;
        System.out.println("Enter pharmacy fee:");
        double pf=sc.nextDouble();
        acc.bill(df,pf);
        acc.diagnosis(doc,d);
        acc.displayDetails();
        sc.close();
    }
}