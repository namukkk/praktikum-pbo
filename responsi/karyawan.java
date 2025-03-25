package responsi;

public abstract class karyawan extends civitasakademika {
    protected String nip;
    protected int masaKerja;
    public static int jumlahPegawai = 0;

    public karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
        jumlahPegawai++;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();
}
