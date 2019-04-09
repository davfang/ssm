/**
 * @CompanyName:
 * @author: Guo Huaijian
 * @Date:
 * @description:
 */
package com.pzhu.management.controller;

import com.pzhu.management.pojo.User;
import com.pzhu.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserControlloer {

    @Autowired
    private UserService userService;
    @RequestMapping("/longin")
    public String longin(User user, Model model){
       User user1 = userService.userlongin(user);
       if (user1!=null){
           model.addAttribute("username",user.getUsername());
           return "main";
       }else {
           return "loginfail";
       }

    }
    @RequestMapping("/register")
    public String register(User user){
       int i = userService.register(user);
        return "login";
    }

}
