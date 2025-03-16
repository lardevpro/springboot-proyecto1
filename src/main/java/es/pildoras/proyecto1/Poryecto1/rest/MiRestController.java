package es.pildoras.proyecto1.Poryecto1.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiRestController {

    @GetMapping("/")
    public String saludo(){
        return "index";
    }

    @GetMapping("/info")
    public String info(){
        return "Esta es la mejor página del mundo mundial";
    }
}
