package com.dcc.ufjf;

import java.util.ArrayList;
import java.util.List;

public class Boleto {

    private BoletoEstado estado;
    private List<BoletoEstado> memento = new ArrayList<>();

    public BoletoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(BoletoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<BoletoEstado> getEstados() {
        return this.memento;
    }
}