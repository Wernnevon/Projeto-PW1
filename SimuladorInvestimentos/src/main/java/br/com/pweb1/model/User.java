package br.com.pweb1.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class User {
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String sexo;
    private LocalDate nascimento;
    private BigDecimal carteira;

    public User(){
    }

    public User(String nome, String sobrenome, String email, String senha, String sexo, LocalDate nascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public BigDecimal getCarteira() {
        return carteira;
    }

    public void setCarteira(BigDecimal carteira) {
        this.carteira = carteira;
    }
}
