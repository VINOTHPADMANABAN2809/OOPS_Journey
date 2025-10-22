package Polymorphism;

class Animal{
    void MakeSound(){
        System.out.println("Some Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    void MakeSound(){
        System.out.println("Dog Barks");
    }
}

public class RunTime {
    public static void main(String[] vk){
        Animal a;
        a = new Dog();
        a.MakeSound();

        a = new Animal();
        a.MakeSound();
    }
}
