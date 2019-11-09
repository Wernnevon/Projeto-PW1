package br.com.pweb1.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class JanelaInvestimentos {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private List<Object> ativos;

    public JanelaInvestimentos() {
    }

    public JanelaInvestimentos(LocalDateTime inicio, LocalDateTime fim, List<Object> ativos) {
        this.inicio = inicio;
        this.fim = fim;
        this.ativos = ativos;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public List<Object> getAtivos() {
        return ativos;
    }

    public void setAtivos(List<Object> ativos) {
        this.ativos = ativos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JanelaInvestimentos that = (JanelaInvestimentos) o;
        return Objects.equals(inicio, that.inicio) &&
                Objects.equals(fim, that.fim) &&
                Objects.equals(ativos, that.ativos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inicio, fim, ativos);
    }
}
