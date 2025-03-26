package Pertemuan5.LatihanPertemuan5;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;
    private final int A = 14;

    PNS(){
        nip = " ";
    }

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter
    public String getNip() { 
        return nip; }
    public static int getCounterPNS() { 
        return counterPNS; }

    // Setter
    public void setNip(String nip) { 
        this.nip = nip; }
        
    @Override
    public int hitungMasaKerja() {
        return (int) java.time.temporal.ChronoUnit.YEARS.between(tgl_mulai_kerja, java.time.LocalDate.now()) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}
