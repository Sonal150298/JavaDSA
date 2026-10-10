package src.Inheritance.Transport;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    public void startAC(){
        System.out.printf("AC started of %s : %s\n",name,model);
    }
    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name,model,noOfTyres);//invokes constructor or method of immediate parent class
        this.noOfDoors=noOfDoors;
        this.transmissionType=transmissionType;
        //super.startEngine();//calling immediate parent class methods
       // super.stopEngine();
    }

}
