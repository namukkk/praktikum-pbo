package Pertemuan4.LatihanPertemuan4;

public class Tanggal {
    /**************** ATRIBUT ****************/
    private int hari;
    private int bulan;
    private int tahun;

    public Tanggal() {
        hari = 0;
        bulan = 0;
        tahun = 0;
    }

    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    /**************** METHOD ****************/
    public int getHari() { 
        return hari; }

    public void setHari(int hari) { 
        this.hari = hari; }

    public int getBulan() { 
        return bulan; }

    public void setBulan(int bulan) { 
        this.bulan = bulan; }

    public int getTahun() { 
        return tahun; }

    public void setTahun(int tahun) { 
        this.tahun = tahun; }

    public String toString() {
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return hari + " " + namaBulan[bulan - 1] + " " + tahun;
    }
}
