package com.udea.ms_login_agroline;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public @ResponseBody
    String hello(){
        return "Hello this is test message.";
    }
}
