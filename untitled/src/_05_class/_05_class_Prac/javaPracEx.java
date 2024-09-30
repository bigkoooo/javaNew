package _05_class._05_class_Prac;

import java.util.ArrayList;
import java.util.Scanner;

public class javaPracEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<javaPrac1> rectangles = new ArrayList<>(); // Rectangle 객체를 담을 ArrayList 생성

        while (true) {
            // 가로와 세로 길이를 입력받기
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            // 가로와 세로가 모두 0일 경우 입력 종료
            if (width == 0 && height == 0) {
                break;
            }

            // Rectangle 객체 생성 후 ArrayList에 추가
            rectangles.add(new javaPrac1(width, height));
        }

        // 입력된 모든 사각형 정보 출력
        System.out.println("입력된 사각형 정보:");
        for (javaPrac1 rect : rectangles) {
            System.out.println(rect);  // toString() 메서드가 자동으로 호출됨
            System.out.println("----------------------------");
        }

        // Rectangle 인스턴스 개수 출력
        System.out.println("Rectangle 인스턴스의 개수는: " + javaPrac1.getInstanceCount());

        scanner.close();
    }
}
