package _03_array;

import java.util.Arrays;
import java.util.Scanner;

public class pracJava1 {
    public static void main(String[] args) {

        System.out.println("문자를 입력해주세요");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        // 예시 배열
        int[] numbers = {number1, number2, number3, number4, number5};


        System.out.println("==== 입력 결과 출력 ====");

        int sum = 0;
        // 배열 길이는 반복문에서 자주 쓰임
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum = " + sum);

        // 평균 구하기
        double avg = (double) sum / numbers.length;
        System.out.println("avg = " + avg);


    }
}

