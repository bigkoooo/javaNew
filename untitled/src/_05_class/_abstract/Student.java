package _05_class._abstract;

public abstract class Student {
    // 필드 선언
    String name;
    String school;
    int age;
    String studentId;

    // 생성자 선언
    public Student(String name, String school, int age, String studentId) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentId = studentId;
    }

    // 추상 메소드 (점심 메뉴)
    abstract void lunch();

    // 학생 정보를 출력하는 메소드
    void printInfo() {
        System.out.println("===== " + name + " 학생의 정보 =====");
        System.out.println("학교: " + school);
        System.out.println("나이: " + age);
        System.out.println("학번: " + studentId);
    }
}
