/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan32.daftarfilm;

/**
 *
 * @author Gandy Christian Situmorang
 */
public class film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(String parName, String parGenre, double parRating,
            int parDuration){
        System.out.println("Judul film : " + parName);
        System.out.println("Genre film : " + parGenre);
        System.out.println("Rating film : " + parRating);
        System.out.println("Duration film : " + parDuration + " Menit" + "\n");
    }
}
