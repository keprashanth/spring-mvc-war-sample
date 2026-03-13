
package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

  @GetMapping("/hello")
  public String hello(Model model) {
    model.addAttribute("message", "Hello from Spring MVC (WAR)!");
    return "hello"; // resolves to /WEB-INF/views/hello.jsp
  }
}
