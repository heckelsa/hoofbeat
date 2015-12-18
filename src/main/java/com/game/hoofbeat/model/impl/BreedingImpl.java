package com.game.hoofbeat.model.impl;

import com.game.hoofbeat.model.Breeding;

import java.util.Random;

public class BreedingImpl implements Breeding {

    public String createFoalAndReturnColor(GenImpl mutterGen, GenImpl vaterGen){
        // Gene des Fohlens generieren
        String foal_genAgouti = newGen(mutterGen.getGen_agouti(), vaterGen.getGen_agouti());
        String foal_genBlack = newGen(mutterGen.getGen_black(), vaterGen.getGen_black());
        String foal_genCream = newGen(mutterGen.getGen_cream(), vaterGen.getGen_cream());
        String foal_genChamp = newGen(mutterGen.getGen_champ(), vaterGen.getGen_champ());
        String foal_genDun = newGen(mutterGen.getGen_dun(), vaterGen.getGen_dun());
        String foal_genRoan = newGen(mutterGen.getGen_roan(), vaterGen.getGen_roan());

        // Alle Gene zu einem String zusammenf�gen
        StringBuffer foalGen = new StringBuffer();
        foalGen.append(foal_genAgouti);
        foalGen.append(foal_genBlack);

        String foalGenString = foalGen.toString();

        ColorImpl farbeFoal = new ColorImpl();
        String foalColor = farbeFoal.getBaseColor(foalGenString);

        return foalColor; 
    }

    /**
     * Returns the gender of the foal
     * @return      a random Number between 0 and 1
     */
    private int randomGender(){
        return randomNumber(0,2);
    }

    /**
     * Returns a random Number between two numbers. The maxinum Number needs +1 more then should be shown. Example:
     * You want a random Number of 0 or 1. You'll put as minimum 0 and as maximum 2
     * @param  minNum  minimum random Number
     * @param  maxNum  maximum random Number
     * @return      a random Number (integer)
     */
    private int randomNumber(int minNum, int maxNum){
        Random rn = new Random();
        int range = maxNum - minNum + 1;
        int randomNum =  rn.nextInt(range) + 0;
        return randomNum;
    }

    /**
     * Returns a new com.game.hoofbeat.model.impl.GenImpl of a foal
     * @param  mutterGen  String of the mutter com.game.hoofbeat.model.impl.GenImpl
     * @param  vaterGen  String of the vater com.game.hoofbeat.model.impl.GenImpl
     * @return      ein com.game.hoofbeat.model.impl.GenImpl des Fohlens
     */
    private String newGen(String mutterGen, String vaterGen){
        String[] mutterGenArray = splitString(mutterGen);
        String[] vaterGenArray = splitString(vaterGen);

        String newFoalGen = joinGen(mutterGenArray, vaterGenArray);

        return newFoalGen;
    }

    /**
    * Splits one com.game.hoofbeat.model.impl.GenImpl of the mother or father and returns it in an array
    * @param  genString  an String which includes one com.game.hoofbeat.model.impl.GenImpl
    * @return      String array of the letters of the String
    */
    private String[] splitString(String genString){
        String[] genStringArrayEnd = new String[genString.length()];
        String[] genStringArray = genString.split("");

        int x = 0;
        if(genStringArray.length != genString.length()){
            // remove empty lines in Array
            for(int i=0;i<genStringArray.length;i++){
                if(!genStringArray[i].matches("\\s*")){
                    // Line is not blank
                    genStringArrayEnd[x] = genStringArray[i];
                    x++;
                }
            }
        }else{
            // no empty lines in array
            for(int i=0;i<genStringArray.length;i++){
                genStringArrayEnd[x] = genStringArray[i];
                x++;
            }
        }

        return genStringArrayEnd;
    }

    /**
     * Returns a random gen for a new foal
     * @param  mutterGenString  a String Array of the mother Genes (should be length 2)
     * @param  vaterGenString  a String Array of the vater Genes (should be length 2)
     * @return      A new random com.game.hoofbeat.model.impl.GenImpl (String)
     */
    private String joinGen(String[] mutterGenString, String[] vaterGenString){

        StringBuffer newGen = new StringBuffer("");

        int mutterLength = mutterGenString.length;
        int mutterRandom = randomNumber(0,mutterGenString.length-1);

        int vaterLength = vaterGenString.length;
        int vaterRandom = randomNumber(0,vaterLength-1);

        newGen.append(mutterGenString[mutterRandom]);
        newGen.append(vaterGenString[vaterRandom]);

        String newGenString = newGen.toString();

        return newGen.toString();
    }
}
