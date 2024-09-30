package _05_class._inheritance;

public class Bus extends Vehicle {
    // Bus 고유 필드
    private int passengerCapacity;

    // 생성자
    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    // 승객 운송 메서드
    @Override
    public void drive() {
        System.out.println("승객을 운송합니다.");
    }

    // 차량 정보 출력
    @Override
    public String toString() {
        return "Bus {" + "brand='" + brand + "', model='" + model + "', year=" + year +
                ", passengerCapacity=" + passengerCapacity + "}";
    }
}
