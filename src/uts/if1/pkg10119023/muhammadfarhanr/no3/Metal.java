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
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artistName){
        System.out.println(artistName+" adalah musisi Metal");
    }
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName+" adalah musisi HeavyMetal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName+" adalah musisi Punk");
    }
    public void genreGrunge(String artistName){
        System.out.println(artistName+" adalah musisi Grunge");
    }
    
}
