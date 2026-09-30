package Logicnotas;

import java.util.SequencedSet;

public class Switch {

    public static void main(String[] args) {

        System.out.println("seleccione 1. cuenta de ahorros\n" +
                "2. credito\n" +
                "3. inversion\n" +
                "4. Mis datos");

        int option= ValidadorDetipos.validarEnteros();

        System.out.println(option);
    }
}
