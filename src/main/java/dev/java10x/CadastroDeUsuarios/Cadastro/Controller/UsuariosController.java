package dev.java10x.CadastroDeUsuarios.Cadastro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuariosController {

       @GetMapping(name = "/Boas Vindas")
       public String boasVindas(){
           return "Boas Vindas";
       }


}
