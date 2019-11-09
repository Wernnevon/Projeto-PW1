package br.com.pweb1.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


public class User {
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String sexo;
    private LocalDate nascimento;
    private BigDecimal carteira;
    private List<Object> ativos;

    public User(){
    }

    public User(String nome, String sobrenome, String email, String senha, String sexo, LocalDate nascimento, BigDecimal carteira, List<Object> ativos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.carteira = carteira;
        this.ativos = ativos;
    }

    public List<Object> getAtivos() {
        return ativos;
    }

    public void setAtivos(List<Object> ativos) {
        this.ativos = ativos;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nome, user.nome) &&
                Objects.equals(sobrenome, user.sobrenome) &&
                Objects.equals(email, user.email) &&
                Objects.equals(senha, user.senha) &&
                Objects.equals(sexo, user.sexo) &&
                Objects.equals(nascimento, user.nascimento) &&
                Objects.equals(carteira, user.carteira) &&
                Objects.equals(ativos, user.ativos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, email, senha, sexo, nascimento, carteira, ativos);
    }
}

