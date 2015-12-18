package com.game.hoofbeat.model.impl;

import com.game.hoofbeat.model.Horse;

public class HorseImpl implements Horse {

    private String pfd_name;
    private int pfd_geschlecht;
    private String pfd_farbe;
    private GenImpl pfd_gene;


    public HorseImpl(String name, int geschlecht, String farbe, GenImpl gene) {
        super();
        this.pfd_name = name;
        this.pfd_geschlecht = geschlecht;
        this.pfd_farbe = farbe;
        this.pfd_gene = gene;
    }


    private void Pferd(String name, int geschlecht, GenImpl gene){

    }
}
