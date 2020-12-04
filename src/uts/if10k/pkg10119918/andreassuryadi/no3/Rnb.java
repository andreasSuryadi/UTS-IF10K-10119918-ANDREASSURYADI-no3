/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119918.andreassuryadi.no3;

/**
 *
 * @author andreas
 */
public class Rnb extends MusicGenre implements Blues, Jazz {
    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName + " adalah musisi genre Jazz");
    }
    
    @Override
    public void genreBlues(String artistName) {
        System.out.println(artistName + " adalah musisi genre Blues");
    }
}
