package kr.hs.study.Model2.controller;

import kr.hs.study.Model2.dto.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
//    // test1에 접속했을 때 result.html를 실행
//    @GetMapping("/test1")
//    public String test1(@RequestParam("id") String id,
//                        @RequestParam("pass") String pass, Model model) {
//        System.out.println(id);
//        System.out.println(pass);
//        model.addAttribute("uid", id);
//        model.addAttribute("upass", pass);
//        return "result";
//    }


    @GetMapping("/test1")
    public String test1(user u, Model model) {
        String uid = u.getId();
        String upass = u.getPass();
        model.addAttribute("uid", uid);
        model.addAttribute("upass", upass);

        return "result";
    }


}
