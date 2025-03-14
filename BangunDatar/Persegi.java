package Pertemuan4.BangunDatar;
/* Nama File    : Persegi.java
 * Deskripsi    : 
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 14/03/2025
 */

public class Persegi extends BangunDatar{
    /**************** ATRIBUT ****************/
    private double sisi;

    /**************** METHOD ****************/
    public Persegi() {
        sisi = 0;
    }
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi*sisi;
    }

    public double getKeliling() {
        return sisi*4;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}