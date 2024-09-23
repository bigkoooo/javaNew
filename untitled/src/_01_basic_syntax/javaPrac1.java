package _01_basic_syntax;

import java.util.Scanner;

public class javaPrac1 {
    public static void main(String[] args) {

        System.out.println("이름 입력해주세요");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // 공백 이전까지의 문자열을 읽음

        System.out.println("나이 입력해주세요");

        int age = scanner.nextInt(); // 공백 이전까지의 정수를 읽음

        System.out.println("==== 입력 결과 출력 ====");
        System.out.printf("하이요 %s님", name);
        System.out.printf("( %d 세)", age);

        scanner.close(); // scanner 닫기
    }
}