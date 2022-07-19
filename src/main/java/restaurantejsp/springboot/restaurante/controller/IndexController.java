package restaurantejsp.springboot.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import restaurantejsp.springboot.restaurante.modelo.Cliente;
import restaurantejsp.springboot.restaurante.modelo.Prato;

import java.util.List;

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





}
