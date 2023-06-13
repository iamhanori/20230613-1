package kr.hs.study.Model2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    // test1에 접속했을 때 result.html를 실행
    @GetMapping("/test1")
    public String text1(@RequestParam("id") String id,
                        @RequestParam("pass") String pass) {
        System.out.println(id);
        System.out.println(pass);

        return "result";
    }
}
