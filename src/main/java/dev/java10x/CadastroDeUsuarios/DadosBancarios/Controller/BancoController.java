package dev.java10x.CadastroDeUsuarios.DadosBancarios.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BancoController {

    @GetMapping("/Banco")
    public String banco(){
        return "este e meu banco";
    }

}
