package codingon.spring_boot_default.controller._01_Prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PracController {

    // 1번 요구사항: age가 20보다 적거나 같을 때 다른 메시지를 출력
    @GetMapping("/ageCheck")
    public String ageCheck(Model model) {
        int age = 20;  // 나이를 10으로 설정
        model.addAttribute("age", age);
        // 템플릿 파일 경로 수정
        return "_01_Prac/ageCheck";  // 해당 템플릿 파일로 이동
    }

    // 2번 요구사항: Person 객체 4명 이상의 정보로 테이블 출력
    @GetMapping("/people")
    public String showPeople(Model model) {
        // Person 객체 리스트 생성
        List<Person> people = new ArrayList<>();
        people.add(new Person("kim", 10));
        people.add(new Person("lee", 20));
        people.add(new Person("hong", 30));
        people.add(new Person("park", 40));
        people.add(new Person("shin", 50));

        // 모델에 리스트 추가
        model.addAttribute("people", people);

        // 템플릿 파일 경로 수정
        return "_01_Prac/peopleTable";  // 해당 템플릿 파일로 이동
    }

    // Person 클래스 정의
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
