package br.com.alura.springboot.listavip.controllers;

import br.com.alura.springboot.listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rafaelthomazelli on 30/03/17.
 */
@Controller
public class IndexController {

    @Autowired
    private ConvidadoRepository inviteRepo;

    @RequestMapping("/")
    public String welcome(){
        return "index";
    }

    @RequestMapping("listaconvidados")
    public String invitedlist(Model model){
        model.addAttribute("convidados", inviteRepo.findAll());
        return "invitedlist";
    }
}
