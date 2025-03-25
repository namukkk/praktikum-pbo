package Pertemuan1;
/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      :
 * Tanggal      :
 */

 public class Titik {
    /****************ATRIBUT****************/
    private double absis;
    private double ordinat;
    private static int countertitik = 0;

    /****************METHOD****************/
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        countertitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        countertitik++;
    }

    public static int getCounterTitik() {
        return countertitik;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat 
    public double getOrdinat () {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x 
    public void setAbsis (double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat (double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y 
    public void geser (double x, double y) {
        absis = absis + x;
        ordinat = ordinat + x;
    }

    //mencetak koordinat titik
    public void printTitik () {
    System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik () {
        System.out.println(Titik.countertitik);
    }

    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0;
    }
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public Titik getRefleksiX() {
        Titik t = new Titik();
        t.setAbsis(this.absis);
        t.setOrdinat(-this.ordinat);
        return t;
    }
    
    public Titik getRefleksiY() {
        Titik t = new Titik(); 
        t.setAbsis(-this.absis);
        t.setOrdinat(this.ordinat);
        return t;
    }
 }
    //end class Titik




