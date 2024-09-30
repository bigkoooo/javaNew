package _05_class._inheritance;

public class Vehicle {
    // 공통 필드
    protected String brand;
    protected String model;
    protected int year;

    // 생성자
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 시동 켜기 메서드
    public void startEngine() {
        System.out.println("차량 시동을 걸었습니다.");
    }

    // 차량 운전 메서드 (추상 메서드 대신 일반 메서드로 구현)
    public void drive() {
        System.out.println("차량을 운전합니다.");
    }

    // 시동 끄기 메서드
    public void stopEngine() {
        System.out.println("차량을 정지했습니다.");
    }

    // 차량 정보 출력
    @Override
    public String toString() {
        return brand + " {brand='" + brand + "', model='" + model + "', year=" + year + "}";
    }
}
