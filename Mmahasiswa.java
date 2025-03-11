/* Nama File    : MMahasiswa.java
 * Deskripsi    : class main mahasiswa
 * Pembuat      : Nathan Benigno Panda
 * Tanggal      : 28/02/2025
 */

public class Mmahasiswa {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("D001", "Dr. Ahmad", "Informatika"); 
        Dosen dosen2 = new Dosen("D002", "Dr. budi", "Informatika"); 
        Dosen dosen3 = new Dosen("D003", "Dr. Andi", "Informatika");
        
        MataKuliah matkul1 = new MataKuliah("Mk001", "Dasar Pemrograman", 4);
        MataKuliah matkul2 = new MataKuliah("Mk004", "Statistika", 3);
        MataKuliah matkul3 = new MataKuliah("Mk005", "Matematika", 3);

        Kendaraan kendaraan1 = new Kendaraan("B1234WKA", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan("B1234WFY", "Motor");
        Kendaraan kendaraan3 = new Kendaraan("G1234GH", "Motor");

        Mahasiswa mhs1 = new Mahasiswa("24060123130090", "Nino", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("24060123120060", "Noni", "Informatika");
        Mahasiswa mhs3 = new Mahasiswa("24060123130101", "Nina", "Informatika");

        mhs1.setDosenWali(dosen1);
        mhs2.setDosenWali(dosen2);
        mhs3.setDosenWali(dosen3);

        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);
        mhs1.addMatKul(matkul3);

        mhs2.addMatKul(matkul2);
        mhs2.addMatKul(matkul3);

        mhs3.addMatKul(matkul1);
        mhs3.addMatKul(matkul2);

        mhs1.setKendaraan(kendaraan3);
        mhs2.setKendaraan(kendaraan1);
        mhs3.setKendaraan(kendaraan2);

        mhs1.printDetailMhs();
        //mhs2.printDetailMhs();
        //mhs3.printDetailMhs();

        kendaraan1.printKendaraan();
        mhs1.printMhs();
        dosen1.printDosen();

    }
}
