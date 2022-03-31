package br.luca;

/**
 * Hello world!
 *
 */
public class Escoteiro {
    public long subsidioSocio(double tempoSocio) {
        if (tempoSocio > 2) {
            return 50;
        } else if (tempoSocio == 2) {
            return 35;
        } else {
            return 25;
        }
    }

    public long subsidioPosto(String posto) {
        if (posto == "LOBO") {
            return 10;
        } else if (posto == "URSO") {
            return 15;
        } else if (posto == "LEÃO") {
            return 20;
        } else {
            return 0;
        }
    }
}
