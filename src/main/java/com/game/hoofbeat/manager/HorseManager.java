package com.game.hoofbeat.manager;

import com.game.hoofbeat.manager.HorseManager;
import com.game.hoofbeat.model.impl.BreedingImpl;
import com.game.hoofbeat.model.impl.GenImpl;

public class HorseManager {
	
	public String getFoalColor(){
		GenImpl vaterGen = new GenImpl("aa", "Ee", "10", "00", "00", "11");
        GenImpl mutterGen = new GenImpl("Aa", "EE", "00", "10", "10", "00");

        BreedingImpl foal = new BreedingImpl();
        String foalColor = foal.createFoalAndReturnColor(mutterGen, vaterGen);
        
		return foalColor;
	}

}
