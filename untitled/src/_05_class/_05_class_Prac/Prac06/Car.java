package _05_class._05_class_Prac.Prac06;

public class Car extends Vehicle {
    // 생성자
    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    // Vehicle의 move 메소드 오버라이드
    @Override
    public void move() {
        System.out.println("도로를 따라 이동 중");
    }
}
