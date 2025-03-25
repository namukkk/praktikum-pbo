package responsi;

public class dosen extends karyawan {
    private fakultas fakultas;
    public static int jumlahDosen = 0;

    public dosen(String nama, String email, String nip, int masaKerja, fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        jumlahDosen++;
    }

    public fakultas getfakultas() {
        return fakultas;
    }

    public void setfakultas(fakultas fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}
