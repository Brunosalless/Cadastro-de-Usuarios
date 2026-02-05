package dev.java10x.CadastroDeUsuarios.Cadastro.Model;

import dev.java10x.CadastroDeUsuarios.DadosBancarios.Model.BancoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cadastro_de_Usuarios")
@Data // Setters e getters
@NoArgsConstructor // Costrutores
@AllArgsConstructor
public class UsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(unique = true, name = "Email")
    private String email;

    @Column(name = "Data_de_Nascimento")
    private int dataNascimento;

    @Column(unique = true, name = "CPF")
    private int cpf;

    @Column(unique = true, name = "Numero_do_Telefone")
    private int telefone;

    @ManyToOne
    @JoinColumn(name = "Banco_id")
    private BancoModel banco;



}
