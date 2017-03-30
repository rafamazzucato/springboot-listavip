package br.com.alura.springboot.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rafaelthomazelli on 28/03/17.
 */
@SpringBootApplication
@Controller
public class Configutarion {

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "<h1>Olá.<br/>Bem-vindo ao sistema Lista VIP</h1>";
    }

    public static void main(String[] args){
        SpringApplication.run(Configutarion.class, args);
    }

}
