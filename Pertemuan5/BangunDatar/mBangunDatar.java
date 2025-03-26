package Pertemuan5.BangunDatar;
/* Nama File    : mBangunDatar.java
 * Deskripsi    : 
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 18/03/2025
 */

public class mBangunDatar {
    public static void main(String[] args) {
        Lingkaran Lingkaran1 = new Lingkaran(14, "Ungu", "Hitam");
        Lingkaran Lingkaran2 = new Lingkaran(21, "Biru", "Hitam");
        Persegi Persegi1 = new Persegi(6, "Merah", "Hijau");
        Persegi Persegi2 = new Persegi(12, "Ungu", "Merah");

        //Lingkaran1.printInfo();
        //Lingkaran2.printInfo();
        Persegi1.printInfo();
        //Persegi2.printInfo();

        System.out.println(Lingkaran1.isEqualLuas(Lingkaran2));

        Persegi1.zoomIn();
        Lingkaran2.zoomOut();
        Persegi1.zoom(50);

        Persegi1.printInfo();

    }
}
