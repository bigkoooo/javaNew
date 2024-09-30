package _05_class._05_class_Prac;

public class javaPrac2 { // Student 클래스
    // 인스턴스 필드
    private String name;
    private int studentID;
    private int grade;

    // 정적 필드: 전체 학생 수 추적
    private static int totalStudents = 0;

    // 생성자
    public javaPrac2(String name, int studentID, int grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
        totalStudents++; // 새로운 학생이 생성될 때마다 학생 수 증가
    }

    // getter 메서드
    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getGrade() {
        return grade;
    }

    // setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 학생 정보를 출력하는 메서드
    public void displayInfo() {
        System.out.println("----- 학생 정보 -----");
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentID);
        System.out.println("학년: " + grade);
        System.out.println("-------------------");
    }

    // 정적 메서드: 총 학생 수 반환
    public static int getTotalStudents() {
        return totalStudents;
    }
}
