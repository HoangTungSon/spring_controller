package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


@Controller
public class condimentController {
    @GetMapping("/index")
    public String index(@RequestParam(required = false, name = "condiment") String[] condiment, Model model){
        model.addAttribute("condiment", Arrays.toString(condiment));
        return "index";
    }
}
