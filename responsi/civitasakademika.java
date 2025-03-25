package responsi;

public class civitasakademika {
    protected String nama;
    protected String email;
    public static int jumlah = 0;

    public civitasakademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        jumlah++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
