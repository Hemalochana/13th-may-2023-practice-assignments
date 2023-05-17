class Vehicle {
    int speed;

    void start() {
        System.out.println("Vehicle is starting.");
    }

    void stop() {
        System.out.println("Vehicle is stopping.");
    }

    void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Vehicle speed set to: " + speed);
    }

    void increaseSpeed(int increment) {
        speed += increment;
        System.out.println("Vehicle speed increased by: " + increment);
    }

    void decreaseSpeed(int decrement) {
        speed -= decrement;
        System.out.println("Vehicle speed decreased by: " + decrement);
    }

    void displaySpeed() {
        System.out.println("Vehicle speed: " + speed);
    }
}

class Car extends Vehicle {
    void changeGear() {
        System.out.println("Changing gears of the car.");
    }
}

class SpecificCar extends Car {
    void specificAction() {
        System.out.println("Performing specific action of the specific car.");
    }
}

public class VechicleTasks {
    public static void main(String[] args) {
        SpecificCar specificCar = new SpecificCar();
        specificCar.start();
        specificCar.changeGear();
        specificCar.setSpeed(60);
        specificCar.increaseSpeed(20);
        specificCar.decreaseSpeed(10);
        specificCar.displaySpeed();
        specificCar.stop();
        specificCar.specificAction();
    }
}
