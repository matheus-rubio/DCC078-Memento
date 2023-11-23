package com.dcc.ufjf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class BoletoTest {

    @Test
    void deveArmazenarEstados() {
        Boleto boleto = new Boleto();
        boleto.setEstado(BoletoEstadoPendente.getInstance());
        boleto.setEstado(BoletoEstadoPago.getInstance());
        assertEquals(2, boleto.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Boleto boleto = new Boleto();
        boleto.setEstado(BoletoEstadoPendente.getInstance());
        boleto.setEstado(BoletoEstadoPago.getInstance());
        boleto.restauraEstado(0);
        assertEquals(BoletoEstadoPendente.getInstance(), boleto.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Boleto boleto = new Boleto();
        boleto.setEstado(BoletoEstadoPendente.getInstance());
        boleto.setEstado(BoletoEstadoAtrasado.getInstance());
        boleto.setEstado(BoletoEstadoPago.getInstance());
        boleto.setEstado(BoletoEstadoPendente.getInstance());
        boleto.restauraEstado(2);
        assertEquals(BoletoEstadoPago.getInstance(), boleto.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Boleto boleto = new Boleto();
            boleto.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}

