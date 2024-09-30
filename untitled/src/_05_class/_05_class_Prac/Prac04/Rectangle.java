package _05_class._05_class_Prac.Prac04;

public class Rectangle extends Shape {
    // 사각형의 가로와 세로 길이 필드
    double width;
    double height;

    // 생성자 선언
    public Rectangle(String color, double width, double height) {
        super(color, "Rectangle");
        this.width = width;
        this.height = height;
    }

    // 사각형의 넓이를 계산하는 메소드 구현
    @Override
    public double calculateArea() {
        return width * height;
    }
}
