package pro.gsilva.exemplo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/api/hello")
public class HelloController {
    
    @GetMapping(value = "/")
    public String getHello() {
        return "Alô mundo";
    }
    
}
