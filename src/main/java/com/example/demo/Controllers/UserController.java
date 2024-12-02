package com.example.demo3.Controllers;


import com.example.demo3.Models.User;
import com.example.demo3.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("UserForm", user);
        return "newUser";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("UserForm") User user) {
        userService.createUser(user);
        return "redirect:/all";
    }
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("UserForm") User user) {
        userService.updateUser(user);
        return "redirect:/all";
    }


}
