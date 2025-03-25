/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      :
 * Tanggal      :
 */


 class Garis {
    /**************** ATRIBUT ****************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /**************** METHOD ****************/
    // Konstruktor tanpa parameter
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik();
        titikAkhir.setAbsis(1);
        titikAkhir.setOrdinat(1);
        counterGaris++;
    }


    static int getCounterGaris() {
        return counterGaris;
    }

    // Getter dan Setter
    Titik getTitikAwal() {
        return titikAwal;
    }

    void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Mendapatkan panjang garis
    double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Mendapatkan gradien garis
    double getGradien() {
        if (titikAkhir.getAbsis() - titikAwal.getAbsis() == 0) {
            throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mendapatkan titik tengah garis
    Titik getTitikTengah() {
        Titik tengah = new Titik();
        tengah.setAbsis((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2);
        tengah.setOrdinat((titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
        return tengah;
    }

    // Mengecek apakah dua garis sejajar
    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Mengecek apakah dua garis tegak lurus
    boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir
    void printGaris() {
        System.out.println("Garis dari Titik(" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ") ke Titik(" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk y = mx + c
    String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
