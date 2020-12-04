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
public class Metal extends HardRock implements HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.println(artistName + " adalah musisi genre Metal");
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi genre Heavy Metal");
    }
    
    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi genre Punk");
    }
    
    public void genreGrunge(String artistName) {
        System.out.println(artistName + " adalah musisi genre Grunge");
    }
}
