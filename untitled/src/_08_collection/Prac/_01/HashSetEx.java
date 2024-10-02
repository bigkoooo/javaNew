package _08_collection.Prac._01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        // 중복을 허용하지 않는 Set 사용
        Set<Integer> numbers = new HashSet<>();

        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 사용자로부터 입력 받기
            System.out.print("정수를 입력하세요. -1을 입력하면 종료됩니다.\n정수 입력: ");
            int input = scanner.nextInt();

            // 입력이 -1이면 반복 종료
            if (input == -1) {
                break;
            }

            // 입력된 정수를 Set에 추가 (중복되면 추가되지 않음)
            numbers.add(input);
        }

        // 입력 완료 후, 중복 제거된 정수 목록 출력
        System.out.println("중복 제거된 정수 목록: " + numbers);

        // 스캐너 자원 해제
        scanner.close();
    }
}
