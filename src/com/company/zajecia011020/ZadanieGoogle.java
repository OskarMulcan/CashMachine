package com.company.zajecia011020;

import java.util.Arrays;
import java.util.Random;

public class ZadanieGoogle {

    private Integer[] tablicaLiczb = new Integer[300];
    private int zakres1 = 0, zakres2 = 0, zakres3 = 0, zakres4 = 0;

    private Integer prawdopodobienstwo() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private Integer zwrotNaPodstawiePrawdopodobienstwa() {
        Random random = new Random();
        Integer los = prawdopodobienstwo();
        if (los < 50) {
            zakres1++;
            return random.nextInt(250); // zakres ma byc od 0 - 249
        } else if (los >= 50 && los < 80) {
            zakres2++;
            return random.nextInt(750) + 250; //zakres ma byc od 250 - 999
        } else if (los >= 80 && los < 95) {
            zakres3++;
            return random.nextInt(3000) + 1000;// zakres ma byc od 1000 - 3999
        } else {
            zakres4++;
            return random.nextInt(6001) + 4000;// zakres ma byc od 4000 - 10000
        }
    }


    public void dodajWylosowaneLiczbyDoTablicy(){
        for(int x =0 ; x < 300; x++) {
            tablicaLiczb[x] = zwrotNaPodstawiePrawdopodobienstwa();
        }
    }

    public Integer[] getTablicaLiczb() {
        return tablicaLiczb;
    }

    public static void main(String[] args) {
        ZadanieGoogle zadanieGoogle = new ZadanieGoogle();
        zadanieGoogle.dodajWylosowaneLiczbyDoTablicy();
        System.out.println(Arrays.toString(zadanieGoogle.getTablicaLiczb()));

    }
}