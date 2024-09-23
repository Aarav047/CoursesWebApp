package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CourseController {
    @RequestMapping("/courses")
    public String courses(){
      return  "course.jsp";
    }
}
