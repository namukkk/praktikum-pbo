package Pertemuan4.LatihanPertemuan4;

public class DosenTetap extends Pegawai {
    /**************** ATRIBUT ****************/
    private String nidn;
    private String fakultas;
    private Tanggal bup;

    public DosenTetap() {
        nidn = " ";
        fakultas = " ";
    }

    public DosenTetap(String NIP, String nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String nidn, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.nidn = nidn;
        this.fakultas = fakultas;
        this.bup = new Tanggal(tanggalLahir.getHari(), tanggalLahir.getBulan(), tanggalLahir.getTahun() + 65);
    }

    /**************** METHOD ****************/
    public String getNIDN() {
        return nidn; }

    public void setNIDN(String nidn) { 
        this.nidn = nidn; }

    public String getFakultas() {
         return fakultas; }

    public void setFakultas(String fakultas) {
         this.fakultas = fakultas; }

    public Tanggal getBUP() {
         return bup; }

    public void setBUP(Tanggal bup) {
         this.bup = bup; }

    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja() * getGajiPokok();
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("BUP: " + bup);
        System.out.println("Tunjangan: Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
