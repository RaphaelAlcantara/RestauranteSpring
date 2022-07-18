package restaurantejsp.springboot.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import restaurantejsp.springboot.restaurante.DTO.RequisicaoNovoCliente;
import restaurantejsp.springboot.restaurante.modelo.Cliente;
import restaurantejsp.springboot.restaurante.repositorio.ClienteRepositorio;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

@Controller
//@RestController
public class ClienteController {

    @Autowired
    private ClienteRepositorio clienteRepositorio;


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



    //Cadastrar cliente
//    @PostMapping("/cadastrar")
//    public void incluir(@RequestBody Cliente cliente) {
//        clienteRepositorio.save(cliente);
//    }

    @RequestMapping("/cadastrar")
    public String criar(Cliente cliente) {
        clienteRepositorio.save(cliente.toCliente());
        return "login";
    }

    //excluir
    @RequestMapping("/excluir{cpf}")
    public String excluir(@PathVariable String cpf) {
        clienteRepositorio.deleteById(cpf);
        return "redirect:/consultar";
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

}
