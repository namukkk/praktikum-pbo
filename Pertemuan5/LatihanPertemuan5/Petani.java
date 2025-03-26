package Pertemuan5.LatihanPertemuan5;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private final int C = 12;

    public Petani(){
        asal_kota = " ";
    }

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter
    public String getAsalKota() { 
        return asal_kota; }
    public static int getCounterPetani() { 
        return counterPetani; }

    // Setter
    public void setAsalKota(String asal_kota) { 
        this.asal_kota = asal_kota; }

    @Override
    public int hitungMasaKerja() {
        return (int) java.time.temporal.ChronoUnit.YEARS.between(tgl_mulai_kerja, java.time.LocalDate.now()) + C;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
}
