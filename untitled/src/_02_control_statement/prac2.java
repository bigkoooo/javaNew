package _02_control_statement;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        System.out.println("나이를 입력해주세요");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        System.out.println("==== 입력 결과 출력 ====");
        System.out.printf(" %d 세", age);

        System.out.println();

        if (age <8) {
            System.out.println("유아");
        } else if ( age < 14) {
            System.out.println("초등학생");
        } else if ( age < 17 ) {
            System.out.println("중학생");
        } else if ( age < 20 ) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        System.out.println("이름 입력해주세요");
        String name = scanner.next();

        if (name.equals("홍길동")) { // 내용 비교
            System.out.println("정치하는 도적"); // 출력
        } else if (name.equals(("성춘향"))) {
            System.out.println("변사또 씹어먹쥬");
        } else {
            System.out.println("모르겠어요.");
        }

        System.out.println("세 개의 정수를 입력하시오");

        System.out.println();

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        // 예시 배열
        int[] numbers = {number1, number2, number3};

        // 1. 최대값 구하기
        int max = numbers[0];  // 배열의 첫 번째 값을 최대값으로 설정
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  // 더 큰 값이 있으면 max를 업데이트
            }
        }
        System.out.println("최대값: " + max);

        // 2. 최소값 구하기
        int min = numbers[0];  // 배열의 첫 번째 값을 최소값으로 설정
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];  // 더 작은 값이 있으면 min을 업데이트
            }
        }
        System.out.println("최소값: " + min);

        // 3. 합계 구하기
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  // 배열의 각 요소를 더함
        }
        System.out.println("합계: " + sum);

        // 4. 평균 구하기
        double average = (double) sum / numbers.length;  // 합계를 배열의 길이로 나누어 평균 계산
        System.out.println("평균: " + average);

        System.out.println("하나 넣어봐, 정수");

        System.out.println();

        int number4 = scanner.nextInt();

        for (int i = 1; i <= number4; i ++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close(); // scanner 닫기
    }
}
