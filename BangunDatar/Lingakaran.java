package Pertemuan4.BangunDatar;
/* Nama File    : Lingakaran.java
 * Deskripsi    : 
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 14/03/2025
 */

public class Lingakaran extends BangunDatar{
    /**************** ATRIBUT ****************/
    private double jari;

    /**************** METHOD ****************/
    public Lingakaran() {
        jari = 0;
    }
    public Lingakaran(double diameter, String warna, String border) {
        super(1, warna, border);
        jari = diameter/2;
    }

    public double getJari() {
        return jari;
    }

    public void setjari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI*Math.pow(jari, 2);
    }

    public double getkeliling() {
        return Math.PI*jari*2;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getkeliling());
    }
}