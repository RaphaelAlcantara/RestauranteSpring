package restaurantejsp.springboot.restaurante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import restaurantejsp.springboot.restaurante.modelo.Cliente;
import restaurantejsp.springboot.restaurante.modelo.Pagamento;
import restaurantejsp.springboot.restaurante.modelo.Pedido;
import restaurantejsp.springboot.restaurante.modelo.Prato;
import restaurantejsp.springboot.restaurante.repositorio.ClienteRepositorio;
import restaurantejsp.springboot.restaurante.repositorio.PagamentoRepositorio;
import restaurantejsp.springboot.restaurante.repositorio.PedidoRepositorio;
import restaurantejsp.springboot.restaurante.repositorio.PratoRepositorio;

import java.util.List;


@Controller
public class IndexController {




    @GetMapping("/cadastrar")
    public String cadastro() {

        return "cadastro";
    }

    @GetMapping("/mainADM")
    public String mainADM() {

        return "mainADM";
    }


    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Autowired
    private PratoRepositorio pratoRepositorio;

    @Autowired
    private PagamentoRepositorio pagamentoRepositorio;

    @Autowired
    private PedidoRepositorio pedidoRepositorio;


    /*    Listar todos os clientes
          @GetMapping("/listar")
          public List<Cliente> listar() {
          return clienteRepositorio.findAll();}
    */
    //--------------------------CLIENTES-------------------------------------------------------------------

    @GetMapping("/")
    public String index(Model m) {
//    m.addAttribute("erro", "Usuário ou senha inválidos!");
    return "login";
    }

    @GetMapping("/userError")
    public String ErrorUser(Model m) {
    m.addAttribute("erro", "Usuário ou senha inválidos!");
        return "login";
    }

    @GetMapping("/consultar")
    public ModelAndView listarClientes() {
        ModelAndView mv = new ModelAndView("ListaClientes");
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

    @RequestMapping(value = {"/logar"}, method = {RequestMethod.POST})
    public ModelAndView logar(@ModelAttribute Cliente cliente, Model m) {

        List<Cliente> all = clienteRepositorio.findAll();
        for (Cliente c : all) {
            if (c.getCpf().equals(cliente.getCpf()) && c.getSenha().equals(cliente.getSenha())) {
                ModelAndView mv = new ModelAndView("main");
                m.addAttribute("Bemvindo", "Bem vindo ao restaurante Minimalist "+c.getNome());
                m.addAttribute("CC", c.getNome());
                List<Prato> Pratos = pratoRepositorio.findAll();
                List<Cliente> Clientes = clienteRepositorio.findAll();
                List<Pagamento> Pagamentos = pagamentoRepositorio.findAll();
                List<Pedido> Pedidos = pedidoRepositorio.findAll();
                mv.addObject("clientes", Clientes);
                mv.addObject("pratos", Pratos);
                mv.addObject("pagamentos", Pagamentos);
                mv.addObject("pedidos", Pedidos);
                return mv;
            } else if (cliente.getCpf().equals("ADM") && cliente.getSenha().equals("ADM")) {
                ModelAndView mv = new ModelAndView("mainADM");
                return mv;
            }
        }
        m.addAttribute("erro", "Usuário ou senha inválidos!");
        return new ModelAndView("login");
    }

    @RequestMapping("/main")
    public String main() {
        return "main";
    }


    //--------------------------PRATOS-------------------------------------------------------------------

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
    public ModelAndView listarPratos() {
        ModelAndView mv = new ModelAndView("ListaPratos");
        List<Prato> Pratos = pratoRepositorio.findAll();
        mv.addObject("pratos", Pratos);
        return mv;
    }



    @RequestMapping("/excluirPrato{id}")
    public String excluir(@PathVariable Long id) {
        pratoRepositorio.deleteById(id);
        return "redirect:/consultarPrato";
    }

//    @RequestMapping("/main")
//    public ModelAndView main(Model m) {
//        ModelAndView mv = new ModelAndView("main");
//        m.addAttribute("Bemvindo", "Bem vindo ao restaurante Minimalist");
//        List<Prato> Pratos = pratoRepositorio.findAll();
//        List<Cliente> Clientes = clienteRepositorio.findAll();
//        List<Pagamento> Pagamentos = pagamentoRepositorio.findAll();
//        mv.addObject("clientes", Clientes);
//        mv.addObject("pratos", Pratos);
//        mv.addObject("pagamentos", Pagamentos);
//        return mv;
//    }
//--------------------------PAGAMENTO-------------------------------------------------------------------


    @GetMapping("/cadastrarPag")
    public String cadastrarPagamento(){
        return "cadastroPagamento";
    }


    @RequestMapping("/cadastrarPagamento")
    public String criar(Pagamento pagamento, Model m) {
        m.addAttribute("cadastroPagamento", "Cadastro realizado com sucesso!");
        pagamentoRepositorio.save(pagamento.toPagamento());
        return "mainADM";
    }

    @GetMapping("/consultarPagamentos")
    public ModelAndView listarPagamentos() {
        ModelAndView mv = new ModelAndView("ListaPagamentos");
        List<Pagamento> Pagamentos = pagamentoRepositorio.findAll();
        mv.addObject("pagamentos", Pagamentos);
        return mv;
    }

    @RequestMapping("/excluirPagamento{id}")
    public String excluirPagamento(@PathVariable Long id) {
        pagamentoRepositorio.deleteById(id);
        return "redirect:/consultarPagamentos";
    }
//--------------------------PEDIDOS-------------------------------------------------------------------

//    @RequestMapping("idPrato{id}/{cliente}")
//    public ModelAndView idPrato(@PathVariable Long id,@PathVariable String cliente, Model m) {
//        ModelAndView mv = new ModelAndView("RealizarPedido");
//        String prato = pratoRepositorio.findById(id).get().getNome();
//        Double preco = pratoRepositorio.findById(id).get().getPreco();
//        List<Pagamento> Pagamentos = pagamentoRepositorio.findAll();
//        mv.addObject("pagamentos", Pagamentos);
//        m.addAttribute("prato", prato);
//        m.addAttribute("cliente", cliente);
//        m.addAttribute("preco", preco);
//        return mv;
//    }

    @RequestMapping("/RealizarPedido{id}/{cliente}")
    public ModelAndView RealizarPedido(@PathVariable Long id,@PathVariable String cliente, Model m) {
        ModelAndView mv = new ModelAndView("RealizarPedido");
        String prato = pratoRepositorio.findById(id).get().getNome();
        Double preco = pratoRepositorio.findById(id).get().getPreco();
        List<Pagamento> Pagamentos = pagamentoRepositorio.findAll();
        mv.addObject("pagamentos", Pagamentos);
        m.addAttribute("prato", prato);
        m.addAttribute("cliente", cliente);
        m.addAttribute("preco", preco);
        return mv;
    }

    @RequestMapping("/cadastrarPedido")
    ModelAndView cadastrarPedido(Pedido pedido, Model m) {
        ModelAndView mv = new ModelAndView("MeusPedidos");
        m.addAttribute("cadastroPedido", "Cadastro realizado com sucesso!");
        pedidoRepositorio.save(pedido.Topedido());
        List<Pedido> Pedidos = pedidoRepositorio.findAll();
        mv.addObject("pedidos", Pedidos);
        return mv;
    }

    @RequestMapping("/PedidoAdm")
    public ModelAndView PedidoAdm() {
        ModelAndView mv = new ModelAndView("ListaPedidosADM");
        List<Pedido> Pedidos = pedidoRepositorio.findAll();
        mv.addObject("pedidos", Pedidos);
        return mv;
    }

}
