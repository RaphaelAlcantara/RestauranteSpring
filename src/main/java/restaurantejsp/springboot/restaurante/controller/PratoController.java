package restaurantejsp.springboot.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import restaurantejsp.springboot.restaurante.modelo.Cliente;
import restaurantejsp.springboot.restaurante.modelo.Prato;
import restaurantejsp.springboot.restaurante.repositorio.PratoRepositorio;

import java.util.List;

@Controller
public class PratoController {

    @Autowired
    private PratoRepositorio pratoRepositorio;

    @GetMapping("/cadastrarP")
    public String cadastraPrato(){
        return "cadastroPrato";
    }

    @RequestMapping("/cadastrarPrato")
    public String criar(Prato prato, Model m) {
        m.addAttribute("cadastroPrato", "Cadastro realizado com sucesso!");
        pratoRepositorio.save(prato.toPrato());
        return "mainADM";
    }

    @GetMapping("/consultarPrato")
    public ModelAndView listarClientes() {
        ModelAndView mv = new ModelAndView("pratos");
        List<Prato> Pratos = pratoRepositorio.findAll();
        mv.addObject("pratos", Pratos);
        return mv;
    }

    @RequestMapping("/excluirPrato{id}")
    public String excluir(@PathVariable Long id) {
        pratoRepositorio.deleteById(id);
        return "redirect:/consultarPrato";
    }
}
