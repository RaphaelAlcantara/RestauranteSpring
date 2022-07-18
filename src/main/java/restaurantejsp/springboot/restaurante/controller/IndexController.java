package restaurantejsp.springboot.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import restaurantejsp.springboot.restaurante.modelo.Cliente;

import static java.lang.System.out;


@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "login";
    }

    @GetMapping("/cadastrar")
    public String cadastro() {

        return "cadastro";
    }

    @GetMapping("/mainADM")
    public String mainADM() {

        return "mainADM";
    }

    @GetMapping("/main")
    public String main() {

        return "main";
    }


}
