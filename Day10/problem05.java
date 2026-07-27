class Vehicle {
    void start() {
        System.out.println("Vehicle Starts");
    }
}
public class problem05 extends Vehicle {
    void start() {
        System.out.println("Car Starts");
    }
    public static void main(String[] args) {
        problem05 obj = new problem05();
        obj.start();
    }
}