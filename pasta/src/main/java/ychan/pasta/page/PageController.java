package ychan.pasta.page;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/")
    public String homePage() {
        return "welcome";
    }

    @GetMapping("/signin")
    public String signInPage() {
        return "/member/signin";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "/member/signup";
    }
}
