public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.wheels();
        bike.fuel();

        System.out.println();

        Car car = new Car();
        car.wheels();
        car.fuel();

    }
}

abstract class Vehicle{

    void fuel(){ // Non-abstract method
        System.out.println("Yes");
    }

    abstract void wheels(); // Abstract method { can not be implemented, only create}
}

class Car extends Vehicle{

    void wheels(){
        System.out.println("4");
    }
}

class Bike extends Vehicle{

    void wheels(){
        System.out.println("4");
    }
}