package _05_class._inheritance;

public class VehicleTest {
    public static void main(String[] args) {
        // Bus 객체 생성
        Bus bus = new Bus("Hyundai", "City Bus", 2022, 30);
        System.out.println("=== Bus 정보 ===");
        System.out.println(bus);
        bus.startEngine();
        bus.drive();
        bus.stopEngine();

        System.out.println();

        // Car 객체 생성
        Car car = new Car("Toyota", "Camry", 2023, true);
        System.out.println("=== Car 정보 ===");
        System.out.println(car);
        car.startEngine();
        car.drive();
        car.stopEngine();

        System.out.println();

        // Motorcycle 객체 생성
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "A");
        System.out.println("=== Motorcycle 정보 ===");
        System.out.println(motorcycle);
        motorcycle.startEngine();
        motorcycle.drive();
        motorcycle.stopEngine();
    }
}
