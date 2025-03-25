package Pertemuan2;
/* Nama File    : Dosen.java
 * Deskripsi    : atribut dan method class dosen
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 28/02/2025
 */

public class Dosen {
    /**************** ATRIBUT ****************/
    private String nip;
    private String nama;
    private String prodi;

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    public Dosen() {
        nip = " ";
        nama = " ";
        prodi = " ";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public void setNip(String x) {
        nip = x;
    }
    public void setNama(String x) {
        nama = x;
    }
    public void setProdi(String x) {
        prodi = x;
    }

    public void printDosen() {
        System.out.println("Dosen: " + nip + " - " + nama + " (" + prodi + ")");
    }

}