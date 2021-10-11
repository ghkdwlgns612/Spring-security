package shop.page.shoppingmall;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shop.page.shoppingmall.domain.User;
import shop.page.shoppingmall.repository.UserRepository;

@Controller
@AllArgsConstructor
public class TestController {

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    @GetMapping("/")
    public @ResponseBody String home() {
        return "home";
    }

    @GetMapping("/user")
    public @ResponseBody String user() {
        return "user";
    }

    @Secured({"ROLE_MANAGER","ROLE_ADMIN"})
    @GetMapping("/manager")
    public @ResponseBody String manager() {
        return "manager";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/admin")
    public @ResponseBody String admin() {
        return "admin";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("로그인 작동합니다.");
        return "loginForm";
    }

    @PostMapping("/login")
    public @ResponseBody String post_login() {
        System.out.println("로그인을 시도합니다.");
        return "OK";
    }

    @PostMapping("/loginProc")
    public @ResponseBody String loginProc() {
        return "loginSerivce필요합니다.";
    }

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/joinProc")
    public String joinProc(User user) {
        String password = user.getPassword();
        String encode = encoder.encode(password);
        user.setPassword(encode);
        userRepository.save(user);
        return "redirect:/login";
    }
}
