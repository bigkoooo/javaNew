package _05_class;

public class javaPracEx2 {
    public static void main(String[] args) {
        // 세 명의 학생 생성
        javaPrac2 student1 = new javaPrac2("김새싹", 20231001, 1);
        javaPrac2 student2 = new javaPrac2("김줄기", 20231002, 2);
        javaPrac2 student3 = new javaPrac2("김이파리", 20231003, 3);

        // 학생 정보 출력
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        // 총 학생 수 출력
        System.out.println("총 학생 수는 " + javaPrac2.getTotalStudents() + "명 입니다.");
    }
}
