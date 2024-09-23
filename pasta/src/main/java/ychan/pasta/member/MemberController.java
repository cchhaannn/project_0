package ychan.pasta.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ychan.pasta.test.TestService;

// TODO: 주석 추가

@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private TestService testService;

    @PostMapping("/signup")
    public String register(@RequestParam("email") String email, @RequestParam("password") String password) {
        testService.saveTest(email);
        return "LOGIN" + "(ID: " + email + ", PW: " + password + ")";
    }

    @PostMapping("/signin")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
        return "LOGIN" + "(ID: " + email + ", PW: " + password + ")";
    }

    @PostMapping("/singout")
    public String logout() {
        return "LOGOUT";
    }

}
