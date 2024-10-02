package _07_generic.Prac._02;

class Calculator<T extends Number> {
    private T num1;
    private T num2;

    // 생성자
    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 두 숫자를 더하는 메소드
    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    // 메인 메소드
    public static void main(String[] args) {
        // 정수형 계산기
        Calculator<Integer> intCalc = new Calculator<>(10, 5);
        System.out.println("Integer Sum: " + intCalc.add());

        // 실수형 계산기
        Calculator<Double> doubleCalc = new Calculator<>(3.14, 2.5);
        System.out.println("Double Sum: " + doubleCalc.add());
    }
}

