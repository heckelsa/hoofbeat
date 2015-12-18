package com.game.hoofbeat.model.impl;

import com.game.hoofbeat.model.Gen;

public class GenImpl implements Gen{

    private String gen_agouti;
    private String gen_black;
    private String gen_cream = "cc";;
    private String gen_champ = "hh";
    private String gen_dun = "dd";
    private String gen_roan = "rr";

    public GenImpl(String agouti, String black, String cream, String champ, String dun, String roan) {
        super();
        this.gen_agouti = agouti;
        this.gen_black = black;
        this.gen_cream = cream;
        this.gen_champ = champ;
        this.gen_dun = dun;
        this.gen_roan = roan;
    }

    private int getGrundfarbe(String agouti, String black){

        return 0;
    }

    private int getAufhellung(String cream, String champ, String dun, String roan, String brindle)
    {

        return 0;
    }

    private int getScheckung(String tobiano, String overo, String splash, String sabino, String leopard){

        return 0;
    }

    public String getGen_agouti() {
        return gen_agouti;
    }

    public String getGen_black() {
        return gen_black;
    }

    public String getGen_cream() {
        return gen_cream;
    }

    public String getGen_champ() {
        return gen_champ;
    }

    public String getGen_dun() {
        return gen_dun;
    }

    public String getGen_roan() {
        return gen_roan;
    }

    public void setGen_agouti(String gen_agouti) {
        this.gen_agouti = gen_agouti;
    }

    public void setGen_black(String gen_black) {
        this.gen_black = gen_black;
    }

    public void setGen_cream(String gen_cream) {
        this.gen_cream = gen_cream;
    }

    public void setGen_champ(String gen_champ) {
        this.gen_champ = gen_champ;
    }

    public void setGen_dun(String gen_dun) {
        this.gen_dun = gen_dun;
    }

    public void setGen_roan(String gen_roan) {
        this.gen_roan = gen_roan;
    }
}
