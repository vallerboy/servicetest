package pl.oskarpolak.servicetest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.servicetest.models.MathService;

@Controller
public class MainController {

    @Autowired
    MathService mathService;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        mathService.setText("Hehe zmieniłem z poziomu MainControllera");
        return mathService.getText();
    }

    @GetMapping("/get")
    @ResponseBody
    public String getSomeText(){
        return mathService.getText();
    }
}
