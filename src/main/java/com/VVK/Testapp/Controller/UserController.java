package com.VVK.Testapp.Controller;

import com.VVK.Testapp.Model.User;
import com.VVK.Testapp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/welcome")
    public String greet(){
        System.out.println("New Branch");
        return "Welcome Vasanth";
    }
    @GetMapping("/getuser")
    public List<User> getalluser(){
        return userService.getalluser();
    }
    @PostMapping("/createuser")
    public User createuser(@RequestBody @Validated User user){
        return userService.createuser(user);
    }
}
