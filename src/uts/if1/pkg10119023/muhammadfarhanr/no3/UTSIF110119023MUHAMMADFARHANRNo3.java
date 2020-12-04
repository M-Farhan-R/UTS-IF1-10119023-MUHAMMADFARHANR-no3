/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts.if1.pkg10119023.muhammadfarhanr.no3;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Menampilkan musisi dan genre musicnya
 *
 */
public class UTSIF110119023MUHAMMADFARHANRNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rnb a = new Rnb();
        a.genreBlues("Jimmy Hendrik");
        a.genreJazz("Chad Baker");
        
        Folk b = new Folk();
        b.genreFolk("Bob Dylan");
        
        Rockability c = new Rockability();
        c.genreRockability("Elvis Presley");
        
        HardRock d = new HardRock();
        d.genreProgressiveRock("DreamTheater");
        d.genrePopRock("Kiss");
        
        Metal e = new Metal();
        e.genrePunk("MXPX");
        e.genreHeavyMetal("METALLICA");
        
        Grindcore f = new Grindcore();
        f.genreGrindcore("Mesin Tempur");
        
        DeathMetal g = new DeathMetal();
        g.genreDeathMetal("JASAD");
        
        DeathCoreKepiting h = new DeathCoreKepiting();
        h.genreDeathCoreKepiting("Revenge The Fate");
        
        BlackMetal i = new BlackMetal();
        i.genreBlackMetal("Bahemoth");
        
        HardCore j = new HardCore();
        j.genreBlackHardCore("HATEBREED");
    }

}
