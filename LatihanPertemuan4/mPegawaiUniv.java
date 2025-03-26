package Pertemuan4.LatihanPertemuan4;

public class mPegawaiUniv {
    public static void main(String[] args) {
        // Contoh Dosen Tetap
        Tanggal tglLahir1 = new Tanggal(5, 5, 1990);
        Tanggal tmt1 = new Tanggal(1, 1, 2015);
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", tglLahir1, tmt1, 5000000.0, "78647324", "Fakultas Sains dan Matematika");
        dosenTetap.printInfo();

        System.out.println();

        // Contoh Dosen Tamu
        Tanggal tglLahir2 = new Tanggal(10, 8, 1985);
        Tanggal tmt2 = new Tanggal(1, 2, 2020);
        Tanggal kontrakAkhir = new Tanggal(1, 2, 2026);
        DosenTamu dosenTamu = new DosenTamu("9654781236", "Budi", tglLahir2, tmt2, 4000000.0, "87945612", kontrakAkhir);
        dosenTamu.printInfo();

        System.out.println();

        // Contoh Tendik
        Tanggal tglLahir3 = new Tanggal(20, 3, 1988);
        Tanggal tmt3 = new Tanggal(1, 4, 2017);
        Tendik tendik = new Tendik("9876543210", "Citra", tglLahir3, tmt3, 3000000.0, "Akademik");
        tendik.printInfo();
    }
}