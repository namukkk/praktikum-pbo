package Pertemuan2;
/* Nama File    : Mahasiswa.java
 * Deskripsi    : atribut dan method class mahasiswa
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 28/02/2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    /**************** ATRIBUT ****************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        nim = " ";
        nama = " ";
        prodi = " ";
        this.listMatkul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public void setNim(String x) {
        nim = x;
    }
    public void setNama(String x) {
        nama = x;
    }
    public void setProdi(String x) {
        prodi = x;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah matkul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(matkul); 
        } else {
            System.out.println("Maksimal 50 mata kuliah!");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Mahasiswa: " + nim + " - " + nama + " (" + prodi + ")");
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : listMatkul) {
            matkul.printMatKul();
        }
        if (dosenWali != null) {
            dosenWali.printDosen();
        }
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }
        System.out.println("------------------------------------------------");
    }
}
