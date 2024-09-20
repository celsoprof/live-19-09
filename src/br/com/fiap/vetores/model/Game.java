package br.com.fiap.vetores.model;

import java.time.Year;

public class Game {

    private String titulo;
    private String estudio;
    private Year anoLancamento;
    private double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public Year getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Year anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
