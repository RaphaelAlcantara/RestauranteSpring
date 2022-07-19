package restaurantejsp.springboot.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import restaurantejsp.springboot.restaurante.modelo.Cliente;
import restaurantejsp.springboot.restaurante.modelo.Prato;
import restaurantejsp.springboot.restaurante.repositorio.ClienteRepositorio;
import restaurantejsp.springboot.restaurante.repositorio.PratoRepositorio;

import java.util.List;
import java.util.Scanner;

@Controller
//@RestController
public class ClienteController {

    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private PratoRepositorio pratoRepositorio;


    /*    Listar todos os clientes
          @GetMapping("/listar")
          public List<Cliente> listar() {
          return clienteRepositorio.findAll();}
    */
    @GetMapping("/consultar")
    public ModelAndView listarClientes() {
        ModelAndView mv = new ModelAndView("clientes");
        List<Cliente> Clientes = clienteRepositorio.findAll();
        mv.addObject("clientes", Clientes);
        return mv;
    }


   /* Cadastrar cliente
    @PostMapping("/cadastrar")
   public void incluir(@RequestBody Cliente cliente) {
       clienteRepositorio.save(cliente);
    }*/

    @RequestMapping("/cadastrar")
    public String criar(Cliente cliente, Model m) {
        m.addAttribute("cadastro", "Cadastro realizado com sucesso!");
        clienteRepositorio.save(cliente.toCliente());
        return "login";
    }

    //excluir
    @RequestMapping("/excluir{cpf}")
    public String excluir(@PathVariable String cpf) {
        clienteRepositorio.deleteById(cpf);
        return "redirect:/consultar";
    }

    @RequestMapping(value = "/logar", method = RequestMethod.POST)
    public String logar(@ModelAttribute Cliente cliente, Model m) {
        m.addAttribute("erro", "Usuário ou senha inválidos!");
        List<Cliente> all = clienteRepositorio.findAll();
        for (Cliente c : all) {
            if (c.getCpf().equals(cliente.getCpf()) && c.getSenha().equals(cliente.getSenha())) {
//                m.addAttribute("msg", "Bem vindo! "+ c.getNome()+ " Escolha seu prato!");
                return "redirect:/main";
            } else if (cliente.getCpf().equals("ADM") && cliente.getSenha().equals("ADM")) {
                return "mainADM";
            }
        }
        return "redirect:/";
    }




}










        //alterar
//    @PutMapping("/alterar")
//    public void alterar(@RequestBody Cliente cliente){
//        clienteRepositorio.save(cliente);
//    }
/*
    //excluir
    @DeleteMapping("/{cpf}")
    public void excluir(@PathVariable String cpf){
        clienteRepositorio.deleteById(cpf);
    }
    //Consulta unica
    @GetMapping("/{cpf}")
    public Optional<Cliente> consultar(@PathVariable String cpf){
        return clienteRepositorio.findById(cpf);
    }
*/


