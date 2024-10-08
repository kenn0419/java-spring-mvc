package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage() {
        String page = this.userService.handleHelloWorld();
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getCreateAdminPage() {
        return "admin/user/create";
    }
}
