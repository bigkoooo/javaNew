package _08_collection.Prac._01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashSetEx2 {
    public static void main(String[] args) {
        // 이름과 나이를 저장할 Map 생성
        Map<String, Integer> people = new HashMap<>();

        // 사용자 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 이름 입력
            System.out.print("이름을 입력하세요. ('종료'를 입력하면 종료됩니다): ");
            String name = scanner.next();

            // 입력이 '종료'이면 반복 종료
            if (name.equals("종료")) {
                break;
            }

            // 나이 입력
            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();

            // Map에 이름과 나이 저장 (같은 이름이 입력되면 나이 갱신)
            people.put(name, age);
        }

        // 입력된 모든 이름과 나이 출력
        System.out.println("\n입력된 이름과 나이 목록:");
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());
        }

        // 스캐너 자원 해제
        scanner.close();
    }
}
