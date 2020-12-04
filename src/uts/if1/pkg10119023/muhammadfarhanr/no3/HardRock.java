/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119023.muhammadfarhanr.no3;

/**
 *
 * @author Muhammad Farhan R <farhan.10119023@mahasiswa.email.ac.id>
 */
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock{
    public void genreHardRock(String artistName){
        System.out.println(artistName+" adalah musisi HardRock");
    }

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName+" adalah musisi PopRock");
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName+" adalah musisi ProgressiveRock");
    }

    @Override
    public void genrePsychedelicRock(String artistName) {
        System.out.println(artistName+" adalah musisi PsychedellicRock");
    }
    
    
}
