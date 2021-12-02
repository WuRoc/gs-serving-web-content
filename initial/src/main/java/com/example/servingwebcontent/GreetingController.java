package com.example.servingwebcontent;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName GreetingController
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2021-11-16 20:35
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
@Controller
public class GreetingController {

    /**
     *
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/greeting") //HTTP GET请求
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        //https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/ui/Model.html#addAllAttributes-java.util.Collection-
        model.addAttribute("name", name);
        String attribute = (String) model.getAttribute("name");
        System.out.println(attribute);
        if (model.containsAttribute("name")){
            System.out.println(1);
        }
        return "greeting";
    }
}
