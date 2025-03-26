package Pertemuan5.BangunDatar;

/* Nama File    : BangunDatar.java
 * Deskripsi    : 
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 18/03/2025
 */

public abstract class BangunDatar {
    /**************** ATRIBUT ****************/
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /**************** METHOD ****************/
    public BangunDatar() {
        jmlSisi = 0;
        warna = " ";
        border = " ";
        counterBangunDatar++;
    }
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public abstract double getLuas();
    
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
