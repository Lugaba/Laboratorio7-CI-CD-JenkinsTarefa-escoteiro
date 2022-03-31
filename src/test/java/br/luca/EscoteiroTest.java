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

        assertEquals(35, objEscoteiro.subsidioSocio(2));

        assertEquals(55, objEscoteiro.subsidioSocio(3));
    }

    @Test
    public void testSubsidioPosto() {
        assertEquals(10, objEscoteiro.subsidioPosto("LOBO"));

        assertEquals(15, objEscoteiro.subsidioPosto("URSO"));

        assertEquals(20, objEscoteiro.subsidioPosto("LEÃO"));

        assertEquals(0, objEscoteiro.subsidioPosto("LOBINHO"));
    }
}
