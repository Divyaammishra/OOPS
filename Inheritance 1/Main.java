public class Main {
    public static void main(String[] args) {

        Fish dolphine = new Fish();
        dolphine.eats();

    }
}

class Animal{ //Base or Parent class
    String color;

    void eats(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{ //Derived or child class inheriting all the properties of Animal class by using extends

    int fins;

    void swims(){
        System.out.println("Swims on water");
    }
}