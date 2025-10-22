
class vehicle{
    void start(){
        System.out.println("vehicle started");
    }
}

class car extends vehicle{
    String model = "BMW";

    void displayDetail(){
        System.out.println("car model: " + model);
    }
}

public class Inheritance {
    public static void main(String[] vk){
        car mycar = new car();
        mycar.start();
        mycar.displayDetail();
    }
}
