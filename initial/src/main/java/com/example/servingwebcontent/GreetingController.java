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
     * @param nam
     * @param model
     * @return
     */
    @GetMapping("/greeting") //HTTP GET请求
    //@RequestParam(name = "ne", required = false, defaultValue = "World") 这里面只与请求参数有关
    public String greeting(@RequestParam(name = "ne", required = false, defaultValue = "World") String nam, Model model) {
        //https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/ui/Model.html#addAllAttributes-java.util.Collection-
        model.addAttribute("nam", nam);

        String attribute = (String) model.getAttribute("nam");

        System.out.println(attribute);

        if (model.containsAttribute("nam")){

            System.out.println(1);
        }

        return "greeting";
    }
}
