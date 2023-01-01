package fr.avainfo.firstwebsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test {
    @GetMapping("/")
    public String index(Model model) {
        return "Test";
    }

    @GetMapping("/model")
     public String model(@RequestParam(defaultValue = "Default", required = false, name = "value") String params, Model model) {
        model.addAttribute("value", params);
        return "ModelEdit";
    }
}
