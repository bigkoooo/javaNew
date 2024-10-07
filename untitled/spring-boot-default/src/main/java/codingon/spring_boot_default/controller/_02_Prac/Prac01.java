package codingon.spring_boot_default.controller._02_Prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Prac01 {

    // 1. /introduce/{name} 요청 처리
    @GetMapping("/introduce/{name}")
    public String introduceName(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "_02_Prac/res"; // res.html로 이동
    }

    // 2. /introduce2 요청 처리 (Query string 처리)
    @GetMapping("/introduce2")
    public String introduceQuery(@RequestParam(value="name") String name,
                                 @RequestParam(value="age") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "_02_Prac/res"; // res.html로 이동
    }
}
