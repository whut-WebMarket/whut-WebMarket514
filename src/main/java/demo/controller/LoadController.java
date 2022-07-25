package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoadController {
    @RequestMapping("/home/loading")
    public String load(){
        return "load";
    }
}
