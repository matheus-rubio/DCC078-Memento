package com.dcc.ufjf;

public class BoletoEstadoCancelado implements BoletoEstado {

    private BoletoEstadoCancelado() {
    }

    private static BoletoEstadoCancelado instance = new BoletoEstadoCancelado();

    public static BoletoEstadoCancelado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelado";
    }
}