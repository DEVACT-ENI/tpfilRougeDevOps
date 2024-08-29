package com.example.tpfilrougedevops.Controller;

import com.example.tpfilrougedevops.Bo.Entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public Object index() {
        return new Entity("name", "email", "Date");
    }
}
