package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login2")
public class LoginController  {
    @RequestMapping("/login21")
    public String login21( HttpServletRequest request){
       System.out.println(request);
       return "home";
   }
}
