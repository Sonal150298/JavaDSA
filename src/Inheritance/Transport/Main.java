package src.Inheritance.Transport;

public class Main {
    static void main(String[] args) {
        Car car = new Car("Maruti", "800", 4, 5, "Auto");
        car.startEngine();
        car.startAC();
        car.stopEngine();

        MotorCycle motorCycle = new MotorCycle("Splendor", "plus", 2, "U", "Soft");

        motorCycle.startEngine();
        motorCycle.wheelie();
        motorCycle.stopEngine();
    }
}
