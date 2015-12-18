package com.game.hoofbeat.model.impl;

import com.game.hoofbeat.model.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorImpl implements Color {
    /*
    Grundfarbe:
    Fuchs:      AA / Aa / aA / aa  --  ee           = AAee, Aaee, aaee, aAee
    Brauner:    AA / Aa / aA       --  EE / Ee      = AAEE, AAEe, AaEE, AaEe, aAEE, aAEe
    Rappe:      aa                 --  EE / Ee      = aaEE, aaEe

    */


    private String[][][] allBaseColors = {
                                            {
                                                    {"Fuchs"},
                                                    {"AAee", "Aaee", "aaee", "aAee"}
                                            },
                                            {
                                                    {"Brauner"},
                                                    {"AAEE","AAEe","AaEE","AaEe","aAEE","aAEe",}
                                            },
                                            {
                                                    {"Rappe"},
                                                    {"aaEE", "aaEe"}
                                            }
                                         };

    /* { "baseColors" : [
                                        "Fuchs"     : ["AAee", "Aaee", "aaee", "aAee"],
                                        "Brauner"   : ["AAEE","AAEe","AaEE","AaEe","aAEE","aAEe"],
                                        "Rappe"     : ["aaEE", "aaEe"]
                                    ],
                                    "dilutionColors" : [
                                        "Dun" : {
                                            "baseColor" : "Fuchs",
                                            "code"      : ["Dd", "dD", "DD"]
                                        }
                                    ]
                                }; */

    public ColorImpl(){
        this.allBaseColors = allBaseColors;

        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Some String", 42);
    }

    public String getBaseColor(String genCode){
        String foalColor = "";

        for(int i=0;i< allBaseColors.length;i++){
            for(int j=0;j< allBaseColors[i].length;j++){
                int allBaseColorsLength = allBaseColors[i][allBaseColors[i].length-1].length;
                for(int k = 0; k < allBaseColorsLength; k++){

                    String baseGenCode = allBaseColors[i][1][k];
                    if(baseGenCode.equals(genCode)){
                        foalColor =  allBaseColors[i][0][k];
                        break;
                    }

                }
            }
        }

        return foalColor;
    }
}
