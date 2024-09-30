package _05_class._inheritance;

public class Car extends Vehicle {
    // Car 고유 필드
    private boolean convertible;

    // 생성자
    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;
    }

    // 주차 메서드
    @Override
    public void drive() {
        System.out.println("주차했습니다.");
    }

    // 차량 정보 출력
    @Override
    public String toString() {
        return "Car {" + "brand='" + brand + "', model='" + model + "', year=" + year +
                ", convertible=" + convertible + "}";
    }
}
