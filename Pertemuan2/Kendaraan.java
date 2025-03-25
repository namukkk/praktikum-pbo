package Pertemuan2;
/* Nama File    : Kendaraan.java
 * Deskripsi    : atribut dan method class kendaraan
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 28/02/2025
 */

public class Kendaraan {
     /**************** ATRIBUT ****************/
     private String noPlat;
     private String jenis;
 
     /**************** METHOD ****************/
     // Konstruktor tanpa parameter
     public Kendaraan() {
         noPlat = " ";
         jenis = " ";
     }
 
     // Konstruktor dengan parameter
     public Kendaraan(String noPlat, String jenis) {
         this.noPlat = noPlat;
         this.jenis = jenis;
     }
 
     // Getter dan Setter
     public String getNoPlat() {
         return noPlat;
     }
     public String getJenis() {
         return jenis;
     }
     public void setNoPlat(String x) {
         noPlat = x;
     }
     public void setJenis(String x) {
         jenis = x;
     }

     public void printKendaraan() {
        System.out.println("Plat nomor: " + noPlat + ", " + jenis);
    }
}
