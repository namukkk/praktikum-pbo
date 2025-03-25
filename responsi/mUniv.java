package responsi;

public class mUniv {
    public static void main(String[] args) {
        fakultas fakultasTeknik = new fakultas("Teknik", 5000000, 700000);
        fakultas fakultasEkonomi = new fakultas("Ekonomi", 5500000, 6500000);
        fakultas fakultasSainsMatematika = new fakultas("Sains dan Matematika", 8500000, 8000000);

        mahasiswa mhs1 = new mahasiswa("Kevin", "Kev@email.com", "24060123140450", 3, fakultasTeknik);
        mahasiswa mhs2 = new mahasiswa("Putri", "put123@email.com", "24060123120100", 2, fakultasEkonomi);
        mahasiswa mhs3 = new mahasiswa("Nino", "ninop@email.com", "24060123130090", 4, fakultasSainsMatematika);
 
        dosen dosen1 = new dosen("Dr. Rudi", "rudi@email.com", "19800101", 10, fakultasTeknik);
        tendik tendik1 = new tendik("Pak Agus", "agus@email.com", "20010101", 5);

        System.out.println(".......... Data mahasiswa ..........");
        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        System.out.println();
        mhs3.tampilkanInfo();

        System.out.println("\n.......... Data Dosen ..........");
        dosen1.tampilkanInfo();

        System.out.println("\n.......... Data Tendik ..........");
        tendik1.tampilkanInfo();

        System.out.println("\n.......... Jumlah ..........");
        System.out.println("Jumlah Civitas Akademika: " + civitasakademika.jumlah);
        System.out.println("Jumlah mahasiswa: " + mahasiswa.jumlahMahasiswa);
        System.out.println("Jumlah Dosen: " + dosen.jumlahDosen);
        System.out.println("Jumlah Tendik: " + tendik.jumlahTendik);
    }
}