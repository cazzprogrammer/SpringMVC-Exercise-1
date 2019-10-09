package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/")
    public ModelAndView getName(HttpServletRequest req)
    {
        System.out.println("inside");
        User user = new User("Dipankar");
        //String str=req.getParameter("name");
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("user",user);
        System.out.println(user);
        return  modelAndView;
    }
}
