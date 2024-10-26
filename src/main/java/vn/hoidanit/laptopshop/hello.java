package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot! qUAN";
    }

    @GetMapping("/user")
    public String userPage() {
        return "I am user";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "i am admin";
    }

}
