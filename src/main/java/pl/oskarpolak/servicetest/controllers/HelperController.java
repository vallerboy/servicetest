package pl.oskarpolak.servicetest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.servicetest.models.MathService;

@Controller
public class HelperController {

    @Autowired
    MathService mathService;

    @GetMapping("/edit/{text}")
    @ResponseBody
    public String edit(@PathVariable("text") String text){
        mathService.setText(text);
        return "Zmieniono tekst";
    }

}
