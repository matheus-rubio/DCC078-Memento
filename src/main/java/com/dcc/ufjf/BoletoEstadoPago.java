package com.dcc.ufjf;

public class BoletoEstadoPago implements BoletoEstado {

    private BoletoEstadoPago() {
    }

    private static BoletoEstadoPago instance = new BoletoEstadoPago();

    public static BoletoEstadoPago getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pago";
    }

}