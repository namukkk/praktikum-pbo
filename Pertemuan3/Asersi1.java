package Pertemuan3;

/* Nama File    : Asersi1.java
 * Deskripsi    : 
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 04/03/2025
 */

public class Asersi1 {
    public static void main(String[] Args){
        int x = 0;
        if (x>0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
