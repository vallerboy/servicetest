package pl.oskarpolak.servicetest.controllers;

import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.servicetest.models.MathService;

@Controller
public class HelperController {

    @Autowired
    MathService mathService;

    @GetMapping("/edit")
    @ResponseBody
    public String edit(){
        mathService.setText("Hehe jestem editem z Helpera");
        return mathService.getText();
    }

}
