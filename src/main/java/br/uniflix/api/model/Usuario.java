package br.uniflix.api.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @Size(max = 50, message = "O nome não pode ter mais que 50 caracteres")
    private String nome;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Email
    private String email;

    @NotEmpty
    private String senha;

    @CPF
    private String cpf;

    @NotEmpty
    private String endereco;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Cartao cartao;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Favoritos favoritos;

    private Integer visualizacoes;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Mensalidade mensalidade;

    public void setSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        String senhahex = hexString.toString();
        this.senha = senhahex;
    }

}
