package _05_class._05_class_Prac.Prac04;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        // ArrayList를 사용하여 Shape 객체들을 저장
        ArrayList<Shape> shapes = new ArrayList<>();

        // Circle과 Rectangle 객체 생성
        shapes.add(new Circle("Red", 5.0));   // 반지름 5.0인 빨간색 원
        shapes.add(new Rectangle("Blue", 4.0, 6.0));   // 가로 4.0, 세로 6.0인 파란색 사각형

        // 도형 정보 출력
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}
