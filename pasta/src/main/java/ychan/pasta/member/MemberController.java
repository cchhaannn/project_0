package ychan.pasta.member;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/login")
    public String login(@RequestParam("id") String id, @RequestParam("password") String password) {
        return "LOGIN" + "(ID: " + id + ", PW: " + password + ")";
    }

    @PostMapping("/logout")
    public String logout() {
        return "LOGOUT";
    }

}
