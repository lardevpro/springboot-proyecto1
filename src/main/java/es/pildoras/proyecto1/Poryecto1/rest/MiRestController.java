package es.pildoras.proyecto1.Poryecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiRestController {

    @GetMapping("/")
    public String saludo(){
        return "index";
    }
}
