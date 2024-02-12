package com.example.DeployEnvironmentsVariables01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${server.myCustomVarTree.authCode}")
    String authCode;
    @Value("${server.myCustomVarTree.devName}")
    String devName;
    @GetMapping("/dev")
    public String getHelloAndCode() {
        return "Hello, " + devName + " your auth code is: " + authCode;
    }
}
