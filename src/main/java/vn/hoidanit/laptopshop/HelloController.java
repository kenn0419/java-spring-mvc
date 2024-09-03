package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String getUser() {
        return "List User";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Dashboard Admin";
    }
}
