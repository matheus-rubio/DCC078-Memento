package com.dcc.ufjf;

public class BoletoEstadoPendente implements BoletoEstado {

    private BoletoEstadoPendente() {
    }

    private static BoletoEstadoPendente instance = new BoletoEstadoPendente();

    public static BoletoEstadoPendente getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pendente";
    }
}
