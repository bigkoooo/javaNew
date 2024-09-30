package _05_class._05_class_Prac;

import java.util.Scanner;

public class javaPracEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 반지름 입력받기
        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        // 원의 넓이 계산
        double result = javaPrac3.calculateArea(radius);

        // 결과 출력
        System.out.println("원의 반지름: " + radius);
        System.out.println("원의 넓이: " + result);

        scanner.close();
    }
}
