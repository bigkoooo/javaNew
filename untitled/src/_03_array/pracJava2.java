package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pracJava2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");


        while (true) {
            String input = scanner.nextLine();


            if (input.equals("exit")) {
                break;
            }

            strings.add(input);
        }


        System.out.println("==== 입력 결과 출력 ====");
        for (String str : strings) {
            System.out.print(str + "\n");
        }
        System.out.println();
    }
}
