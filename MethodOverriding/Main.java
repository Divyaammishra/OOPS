public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eats();

        Animal animal = new Animal();
        animal.eats();

    }
}

class Animal{

    void eats(){
        System.out.println("Eats Everything");
    }
}

class Dog extends Animal{

    void eats(){
        System.out.println("Eats Roti");
    }
}