package _05_class._05_class_Prac.Prac04;

public abstract class Shape {
    // 필드 선언
    String color;
    String type;

    // 생성자 선언
    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // 도형의 넓이를 계산하는 추상 메소드
    abstract double calculateArea();

    // 도형의 색상을 반환하는 메소드
    public String getColor() {
        return color;
    }

    // 도형의 정보를 출력하는 메소드
    public void printInfo() {
        System.out.println("===== " + type + " 도형의 정보 =====");
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 넓이: " + calculateArea());
    }
}
