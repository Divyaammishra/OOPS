public class Main {
    public static void main(String[] args) {

        Shark shark =  new Shark();
        shark.eats();

        Dog dog = new Dog();
        dog.voice();

    }
}

class Animal{

    void eats(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Shark extends Fish{

    void size(){
        System.out.println("500m");
    }
}

class Mammal extends Animal{

    void walk(){
        System.out.println("Walks");
    }
}

class Dog extends Mammal{

    void voice(){
        System.out.println("Bark");
    }
}