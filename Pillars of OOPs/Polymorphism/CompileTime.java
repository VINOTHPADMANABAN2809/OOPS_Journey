package Polymorphism;

class Math{
    int add(int a,int b){
        return a+b;
    }
    
    double  add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class CompileTime {
    public static void main(String[] vk){
        Math m = new Math();
        System.out.println(m.add(1,2));
        System.out.println(m.add(1.0,2.0));
         System.out.println(m.add(1,2,3));
    }
}
