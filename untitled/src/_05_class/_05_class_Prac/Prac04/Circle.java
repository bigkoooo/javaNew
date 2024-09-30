package _05_class._05_class_Prac.Prac04;

public class Circle extends Shape {
    // 원의 반지름 필드
    double radius;

    // 생성자 선언
    public Circle(String color, double radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    // 원의 넓이를 계산하는 메소드 구현
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
