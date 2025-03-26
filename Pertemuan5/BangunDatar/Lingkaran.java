package Pertemuan5.BangunDatar;
/* Nama File    : Lingkaran.java
 * Deskripsi    : 
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 18/03/2025
 */

public class Lingkaran extends BangunDatar implements IResize{
    /**************** ATRIBUT ****************/
    private double jari;

    /**************** METHOD ****************/
    public Lingkaran() {
        jari = 0;
    }
    public Lingkaran(double diameter, String warna, String border) {
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

    public double getKeliling() {
        return Math.PI*jari*2;
    }

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    public void zoomOut() {
        jari = jari * 0.9;
    }

    public void zoom(int percent){
        jari = jari * percent/100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}