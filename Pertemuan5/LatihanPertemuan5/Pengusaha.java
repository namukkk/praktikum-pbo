package Pertemuan5.LatihanPertemuan5;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private final int B = 13;

    public Pengusaha(){
        npwp = " ";
    }

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter
    public String getNpwp() { 
        return npwp; }
    public static int getCounterPengusaha() { 
        return counterPengusaha; }

    // Setter
    public void setNpwp(String npwp) { 
        this.npwp = npwp; }
        
    @Override
    public int hitungMasaKerja() {
        return (int) java.time.temporal.ChronoUnit.YEARS.between(tgl_mulai_kerja, java.time.LocalDate.now()) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}
