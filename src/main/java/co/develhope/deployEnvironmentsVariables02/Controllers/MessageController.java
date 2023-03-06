package co.develhope.deployEnvironmentsVariables02.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public String mainEndpoint(){
        String var = environment.getProperty("welcomeMsg");
        return var;
    }
}
