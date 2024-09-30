package _05_class._abstract;

public class StudentEx {
    public static void main(String[] args) {
        // Kim 학생 생성
        Student kimStudent = new Student_Kim("김삼성", "흑백 고등학교", 17, "20220001");
        kimStudent.printInfo();
        kimStudent.lunch();

        // Baek 학생 생성
        Student baekStudent = new Student_Baek("백종원", "흑백 고등학교", 18, "20220002");
        baekStudent.printInfo();
        baekStudent.lunch();
    }
}
