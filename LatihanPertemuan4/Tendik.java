package Pertemuan4.LatihanPertemuan4;

public class Tendik extends Pegawai {
    /**************** ATRIBUT ****************/
    private String bidang;

    public Tendik() {
        bidang = " ";
    }

    public Tendik(String NIP, String nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }
    
    /**************** METHOD ****************/
    public String getBidang() {
         return bidang; }

    public void setBidang(String bidang) {
         this.bidang = bidang; }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * getGajiPokok();
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
