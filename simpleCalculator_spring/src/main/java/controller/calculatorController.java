package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculatorController {
    @GetMapping("/index")
    public String index(@RequestParam(required = false, name = "plus") String plus,
                        @RequestParam(required = false, name = "minus") String minus,
                        @RequestParam(required = false, name = "multiply") String multiply,
                        @RequestParam(required = false, name = "division") String division,
                        @RequestParam(required = false, name = "firstNumber") Integer firstNumber,
                        @RequestParam(required = false, name = "secondNumber") Integer secondNumber,
                        Model model) {
        int result = 0;
        String resultEx;
        try {
            if (plus != null) {
                result = firstNumber + secondNumber;
            }
            if (minus != null) {
                result = firstNumber - secondNumber;
            }
            if (multiply != null) {
                result = firstNumber * secondNumber;
            }
            if (division != null) {
                result = firstNumber / secondNumber;
            }
            model.addAttribute("result", result);
        } catch (NullPointerException ex){
            resultEx = "Please enter the number";
            model.addAttribute("result",resultEx);
        } finally {
            return "index";
        }
    }
}
