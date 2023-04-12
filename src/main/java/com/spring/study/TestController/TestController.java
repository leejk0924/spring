package com.spring.study.TestController;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Log4j2
public class TestController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/ModelAttribute")
    public String modelAttributeTest(@ModelAttribute BoxDto box, Model model) {
        model.addAttribute("box1", box.getTest1());
        model.addAttribute("box2", box.getTest2());
        model.addAttribute("box3", box.getTest3());
        log.debug("box 1 : {}", box.getTest1());
        log.debug("box 2 : {}", box.getTest2());
        log.debug("box 3 : {}", box.getTest3());
        return "modelAttribute";
    }

    @PostMapping("/RequestBody")
    public String requestBody(@RequestBody BoxDto box, Model model) {
        model.addAttribute("box1", box.getTest1());
        model.addAttribute("box2", box.getTest2());
        model.addAttribute("box3", box.getTest3());
        System.out.println(box.getTest1() + "test" + box.getTest2() + "test2" + box.getTest3());

        return "requestBody";
    }

}
