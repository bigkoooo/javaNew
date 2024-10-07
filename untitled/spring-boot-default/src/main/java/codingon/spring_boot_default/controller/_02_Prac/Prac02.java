package codingon.spring_boot_default.controller._02_Prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class Prac02 {

    // 폼 페이지 요청 처리
    @GetMapping("/form")
    public String showForm() {
        return "_02_Prac/req02";  // req02.html 파일을 반환
    }

    // POST 요청 처리 (폼 데이터를 처리하여 출력하는 메서드)
    @PostMapping("/submitForm")
    public String submitForm(@RequestParam("name") String name,
                             @RequestParam("gender") String gender,
                             @RequestParam("birthYear") int birthYear,
                             @RequestParam("birthMonth") int birthMonth,
                             @RequestParam("birthDay") int birthDay,
                             @RequestParam("interests") String[] interests,
                             Model model) {

        // 생년월일을 LocalDate로 처리
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        // 모델에 데이터를 추가하여 View로 전달
        model.addAttribute("name", name);
        model.addAttribute("gender", gender.equals("male") ? "남자" : "여자");
        model.addAttribute("birthDate", birthDate);
        model.addAttribute("interests", String.join(", ", interests));

        // res02.html 로 이동
        return "_02_Prac/res02";
    }
}
