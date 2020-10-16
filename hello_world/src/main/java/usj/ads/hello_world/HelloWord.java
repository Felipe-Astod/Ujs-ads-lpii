package usj.ads.hello_world;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWord {

    @GetMapping(value="/")
    public String getHelloWorl() {
        return "Hello World";
    }
    
    
}
