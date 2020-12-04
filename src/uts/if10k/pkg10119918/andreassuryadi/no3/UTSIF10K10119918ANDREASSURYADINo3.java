/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119918.andreassuryadi.no3;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data nama musisi
 * dan genre
 * 
 */

public class UTSIF10K10119918ANDREASSURYADINo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rnb rnb = new Rnb();
        Folk folk = new Folk();
        Rockabilly rockabilly = new Rockabilly();
        HardRock hardRock = new HardRock();
        Metal metal = new Metal();
        Grindcore grindcore = new Grindcore();
        DeathMetal deathMetal = new DeathMetal();
        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        BlackMetal blackMetal = new BlackMetal();
        NewSkul newSkul = new NewSkul();
        
        rnb.genreBlues("Jimmy Hendrik");
        rnb.genreJazz("Chad Baker");
        folk.genreFolk("Bob Dylan");
        rockabilly.genreRockabilly("Elvis Presley");
        hardRock.genreProgressiveRock("DreamTheater");
        hardRock.genrePsychedelicRock("The Doors");
        hardRock.genrePopRock("Kiss");
        metal.genrePunk("MXFX");
        metal.genreHeavyMetal("METALLICA");
        grindcore.genreGrindcore("Mesin Tempur");
        deathMetal.genreDeathMetal("JASAD");
        deathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate");
        blackMetal.genreBlackMetal("Behemoth");
        newSkul.genreNewSkul("HATEBREED");
    }
    
}
