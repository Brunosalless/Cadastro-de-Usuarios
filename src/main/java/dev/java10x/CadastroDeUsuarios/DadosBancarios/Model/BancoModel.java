package dev.java10x.CadastroDeUsuarios.DadosBancarios.Model;

import dev.java10x.CadastroDeUsuarios.Cadastro.Model.UsuariosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BancoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Banco")
    private String banco;

    @Column(name = "Agencia_do_Banco")
    private int agencia;

    @Column(unique = true, name = "Numero_da_Conta")
    private int numeroDaConta;

    @Column(unique = true, name = "Digito_Verificador")
    private int digitoVerificador;

    @OneToMany(mappedBy = "banco")
    private List<UsuariosModel> ninjas;
}
