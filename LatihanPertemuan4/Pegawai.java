package Pertemuan4.LatihanPertemuan4;

public class Pegawai {
    /**************** ATRIBUT ****************/
    private String nip;
    private String nama;
    private Tanggal tglLahir;
    private Tanggal tmt;
    private double gajiPokok;

    public Pegawai() {
        nip = " ";
        nama = " ";
        gajiPokok = 0;
    }

    public Pegawai(String nip, String nama, Tanggal tglLahir, Tanggal tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    /**************** METHOD ****************/
    public String getNIP() {
         return nip; }

    public void setNIP(String nip) {
         this.nip = nip; }

    public String getNama() {
         return nama; }

    public void setNama(String nama) {
         this.nama = nama; }

    public Tanggal getTglLahir() {
         return tglLahir; }

    public void setTglLahir(Tanggal tglLahir) {
         this.tglLahir = tglLahir; }

    public Tanggal getTMT() {
         return tmt; }

    public void setTMT(Tanggal tmt) {
         this.tmt = tmt; }

    public double getGajiPokok() {
         return gajiPokok; }

    public void setGajiPokok(double gajiPokok) {
         this.gajiPokok = gajiPokok; }

    public int hitungMasaKerja() {
        return 2025 - tmt.getTahun();
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tglLahir);
        System.out.println("TMT: " + tmt);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
    }
}
