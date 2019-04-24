package org.spring.config;


import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello There Testing Rest Api";
	}
	@GetMapping("/home")
    public String homeInit(Locale locale, Model model) {
        return "home";
    }

}
