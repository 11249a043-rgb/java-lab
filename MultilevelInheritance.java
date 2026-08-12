class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle {
    void driving() {
        System.out.println("Car is driving");
    }
}
class SportsCar extends Car {
    void racing() {
        System.out.println("Sports car is racing");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        s.start();
        s.driving();
        s.racing();
    }
}