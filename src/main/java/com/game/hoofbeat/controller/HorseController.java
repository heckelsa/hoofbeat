package com.game.hoofbeat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.game.hoofbeat.manager.HorseManager;

@Controller
public class HorseController {
	
	@RequestMapping("/horse")
	
	public ModelAndView showHorseColor() {
		
		HorseManager horseManager = new HorseManager();
		String foalColor = horseManager.getFoalColor();
		
        return new ModelAndView("horse", "foalColor", foalColor);
    }

}