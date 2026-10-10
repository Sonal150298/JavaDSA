package src.AbstractionDesign;


abstract class Bird {
    abstract void fly();

    abstract void eat();
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow Flying...");
    }

    @Override
    void eat() {
        System.out.println("Sparrow Eating...");
    }
}

public class Main {
    static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
        b.eat();
    }

}
