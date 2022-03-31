package br.luca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EscoteiroTest {

    public EscoteiroTest() {

    }

    Escoteiro objEscoteiro = new Escoteiro();

    @Test
    public void testSubsidioSocio() {
        assertEquals(25, objEscoteiro.subsidioSocio(1));
    }
}
