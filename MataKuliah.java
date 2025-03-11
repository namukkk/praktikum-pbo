/* Nama File    : MataKuliah.java
 * Deskripsi    : atribut dan method class matakuliah
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 28/02/2025
 */

public class MataKuliah {
    /**************** ATRIBUT ****************/
    private String idMatKul;
    private String nama;
    private int sks;

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    public MataKuliah() {
        idMatKul = " ";
        nama = " ";
        sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter dan Setter
    public String getIdMatKul() {
        return idMatKul;
    }
    public String getNama() {
        return nama;
    }
    public int getSks() {
        return sks;
    }
    public void setNip(String x) {
        idMatKul = x;
    }
    public void setNama(String x) {
        nama = x;
    }
    public void setProdi(int x) {
        sks = x;
    }

    public void printMatKul() {
        System.out.println("Mata Kuliah: " + idMatKul + " - " + nama + " - " + sks);
    }
}