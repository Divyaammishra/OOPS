public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eats();
        dog.legs = 4;

        System.out.println(dog.legs);
    }
}

class Animal{ //Parent class
    String color;

    void eats(){
        System.out.println("Roti");
    }
    void voice(){
        System.out.println("Yes");
    }
}

class Mammal extends Animal{ //Inheriting all the properties of Animal class
    int legs;
}

class Dog extends Mammal{ //Inheriting all the properties of Animal class as so is Mammal class
    int breed;
}