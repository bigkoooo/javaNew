package _05_class._05_class_Prac.Prac06;

public class Airplane extends Vehicle implements Flyable {
    // 생성자
    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    // Vehicle의 move 메소드 오버라이드
    @Override
    public void move() {
        System.out.println("하늘을 날아가는 중");
    }

    // Flyable 인터페이스의 fly 메소드 구현
    @Override
    public void fly() {
        System.out.println("고도 10,000피트에서 비행 중");
    }
}
