public class Main {
    public static void main(String[] args) {

        Bird bird =  new Bird();

        bird.eat();
        bird.fly();

    }
}

class Animal{

    void eat(){
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

class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Bird extends Animal{

    void fly(){
        System.out.println("Fly");
    }
}