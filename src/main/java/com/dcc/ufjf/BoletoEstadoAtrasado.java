package com.dcc.ufjf;

public class BoletoEstadoAtrasado implements BoletoEstado {

    private BoletoEstadoAtrasado() {
    }

    private static BoletoEstadoAtrasado instance = new BoletoEstadoAtrasado();

    public static BoletoEstadoAtrasado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Atrasado";
    }
}
