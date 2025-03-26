package Pertemuan4.LatihanPertemuan4;

public class DosenTamu extends Pegawai {
    /**************** ATRIBUT ****************/
    private String nidk;
    private Tanggal kontrakBerakhir;

    public DosenTamu() {
        nidk = " ";
    }

    public DosenTamu(String NIP, String nama, Tanggal tanggalLahir, Tanggal TMT, double gajiPokok, String nidk, Tanggal kontrakBerakhir) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.nidk = nidk;
        this.kontrakBerakhir = kontrakBerakhir;
    }
    
    /**************** METHOD ****************/
    public String getNIDK() {
         return nidk; }

    public void setNIDK(String nidk) {
         this.nidk = nidk; }

    public Tanggal getKontrakBerakhir() {
         return kontrakBerakhir; }

    public void setKontrakBerakhir(Tanggal kontrakBerakhir) {
         this.kontrakBerakhir = kontrakBerakhir; }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("NIDK: " + nidk);
        System.out.println("Kontrak Berakhir: " + kontrakBerakhir);
    }
}