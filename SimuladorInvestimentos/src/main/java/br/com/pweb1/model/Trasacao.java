package br.com.pweb1.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Trasacao {
    private int id;
    private BigDecimal valor;
    private LocalDateTime horario;
    private List <Object> ativo;
    private boolean acao;

    public Trasacao() {
    }

    public Trasacao(int id, BigDecimal valor, LocalDateTime horario, List<Object> ativo, boolean acao) {
        this.id = id;
        this.valor = valor;
        this.horario = horario;
        this.ativo = ativo;
        this.acao = acao;
    }

    public boolean isAcao() {
        return acao;
    }

    public void setAcao(boolean acao) {
        this.acao = acao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public List<Object> getAtivo() {
        return ativo;
    }

    public void setAtivo(List<Object> ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trasacao trasacao = (Trasacao) o;
        return id == trasacao.id &&
                Objects.equals(valor, trasacao.valor) &&
                Objects.equals(horario, trasacao.horario) &&
                Objects.equals(ativo, trasacao.ativo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor, horario, ativo);
    }
}
