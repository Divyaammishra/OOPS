public class Main {

    /*
    In Java Multiple Inheritance can be implemented by using Interface
     */
    public static void main(String[] args) {

        biFuelVehicle biFuelVehicle = new biFuelVehicle();

        biFuelVehicle.runOn();

    }
}

interface petrolVehicle{
    void runOn();
}

interface dieselVehicle{
    void runOn();
}

class biFuelVehicle implements petrolVehicle, dieselVehicle{

    public void runOn(){
        System.out.println("Bi-Fuel types of vehicle can run on both Petrol as well as Diesel");
    }
}