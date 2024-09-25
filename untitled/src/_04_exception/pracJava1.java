package _04_exception;

import java.util.*;

public class pracJava1 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1, 2, 3, 4};

            for (int i = 1; i <= numbers.length; i++) {
                System.out.println("배열값: " + numbers[i-1]); // 배열의 값을 출력해야 함
            }

            numbers[5] = 10; // 이 부분에서 예외가 발생 (배열 크기를 넘어섬)
            System.out.println("인덱스의 값을 10으로 수정했습니다. " + Arrays.toString(numbers));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 범위를 벗어났습니다. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생했습니다. " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }

        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            System.out.println("배열 크기를 입력해주세요 >>");

            int size = sc.nextInt(); // 숫자 입력

            int[] array = new int[size];

            System.out.println("==== 배열의 값 입력 ====");
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                System.out.println((i + 1) + "번째 값을 입력:");
                array[i] = sc.nextInt();
                sum += array[i];
            }

            System.out.println("sum = " + sum);

            double avg = (double) sum / array.length;
            System.out.println("avg = " + avg);

        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닌 값이 입력되었습니다. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 범위를 벗어났습니다. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생했습니다. " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");

        }

        Scanner SS = null;

        try {
            SS = new Scanner(System.in);
            System.out.println("배열 크기를 입력해주세요 >>");

            int size = SS.nextInt(); // 숫자 입력

            int[] array = new int[size];
            List<Integer> list = new ArrayList<>(); // 배열 요소를 저장할 리스트
            Set<Integer> duplicates = new HashSet<>(); // 중복을 확인하기 위한 HashSet

            System.out.println("==== 배열의 값 입력 ====");


            for (int i = 0; i < array.length; i++) {
                System.out.println((i + 1) + "번째 값을 입력:");
                array[i] = SS.nextInt();

                if (!list.contains(array[i])) {
                    list.add(array[i]);
                } else {
                    duplicates.add(array[i]); // 중복된 값 저장
                }
            }

            // 중복된 값 출력
            if (!duplicates.isEmpty()) {
                System.out.println("중복된 값들: " + duplicates);
            } else {
                System.out.println("중복된 값이 없습니다.");
            }

        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닌 값이 입력되었습니다. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 범위를 벗어났습니다. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("알 수 없는 예외가 발생했습니다. " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
            if (SS != null) {
                SS.close();
            }
        }


    }

}
