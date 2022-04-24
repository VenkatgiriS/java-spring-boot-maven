package com.example.helloworldspringbootpom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/")
    public String getGreeting() {
        return "Hello!Deployed using Ansible ,Docker and k8s using Jenkins Pipeline. Implemented in Docker server as well as K8s environment";
    }
}
