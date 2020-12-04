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
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock {
    public void genreHardRock(String artistName) {
        System.out.println(artistName + " adalah musisi genre HardRock");
    }
    
    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName + " adalah musisi genre PopRock");
    }
    
    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName + " adalah musisi genre PsychedelicRock");
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + " adalah musisi genre ProgressiveRock");
    }
}
