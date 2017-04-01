package br.com.alura.springboot.listavip.controllers;

import br.com.alura.email.sender.EmailService;
import br.com.alura.springboot.listavip.model.Convidado;
import br.com.alura.springboot.listavip.repository.ConvidadoRepository;
import br.com.alura.springboot.listavip.services.ConvidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by rafaelthomazelli on 30/03/17.
 */
@Controller
public class IndexController {

    @Autowired
    private ConvidadoService convidadoService;

    @RequestMapping("/")
    public String welcome(){
        return "index";
    }

    @RequestMapping("/listaconvidados")
    public String invitedlist(Model model){
        model.addAttribute("convidados", convidadoService.buscarTodos());
        return "invitedlist";
    }

    @RequestMapping(value= "save", method = RequestMethod.POST)
    public String save(@RequestParam("nome") String nome, @RequestParam("email") String email,
                       @RequestParam("telefone") String telefone, Model model){

        Convidado convidado =  new Convidado(nome, email, telefone);
        convidadoService.salvar(convidado);

        new EmailService().send(nome, email);

        return this.invitedlist(model);
    }
}
