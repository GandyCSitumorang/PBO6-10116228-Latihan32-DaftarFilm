/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan32.daftarfilm;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Gandy Christian Situmorang
 * Kelas    : PBO-6
 * NIM      : 10116228
 * Deskripsi Program : program ini berisi program yang menampilkan deskripsi  
 * film yang sedang tayang
 */
public class PBO610116228Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("=== Daftar Film Sedang Tayang ===");
       
       film film1 = new film();
       film1.filmName = "Venom";
       film1.filmGenre = "Action, Horror, Scifi";
       film1.filmRating = 8.5;
       film1.filmDuration = 120;
       film1.nowPlaying(film1.filmName, film1.filmGenre, film1.filmRating, 
               film1.filmDuration);
       
       film film2 = new film();
       film2.filmName = "Venom";
       film2.filmGenre = "Action, Horror, Scifi";
       film2.filmRating = 8.5;
       film2.filmDuration = 120;
       film2.nowPlaying(film2.filmName, film2.filmGenre, film2.filmRating, 
               film2.filmDuration);
    }
    
}
