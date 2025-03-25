package responsi;

public class tendik extends karyawan {
    public static int jumlahTendik = 0;

    public tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        jumlahTendik++;
    }

    @Override
    public double hitungGaji() {
        return 4000000 + (masaKerja * 0.01 * 4000000);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}