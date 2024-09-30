package _05_class._05_class_Prac.Prac06;

public class Vehicle {
    private String name;
    private int maxSpeed;

    // 생성자
    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    // getter와 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // move 메소드
    public void move() {
        System.out.println("이동 중");
    }
}
