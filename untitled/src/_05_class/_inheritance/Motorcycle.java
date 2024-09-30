package _05_class._inheritance;

public class Motorcycle extends Vehicle {
    // Motorcycle 고유 필드
    private String licenseType;

    // 생성자
    public Motorcycle(String brand, String model, int year, String licenseType) {
        super(brand, model, year);
        this.licenseType = licenseType;
    }

    // 운전 메서드 (오버라이드)
    @Override
    public void drive() {
        System.out.println("운행 중입니다.");
    }

    // 차량 정보 출력
    @Override
    public String toString() {
        return "Motorcycle {" + "brand='" + brand + "', model='" + model + "', year=" + year +
                ", licenseType='" + licenseType + "'}";
    }
}
