package _05_class._abstract;

public class Student_Baek extends Student {
    // 생성자 선언
    public Student_Baek(String name, String school, int age, String studentId) {
        super(name, school, age, studentId);
    }

    // 점심 메뉴를 출력하는 메소드 오버라이딩
    @Override
    void lunch() {
        System.out.println("점심은 고기깡패가 만든 육전");
    }
}
