package com.game.hoofbeat.model;

import com.game.hoofbeat.model.impl.GenImpl;

public interface Breeding {

    public String createFoalAndReturnColor(GenImpl mutterGen, GenImpl vaterGen);

}