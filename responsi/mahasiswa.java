package responsi;

public class mahasiswa extends civitasakademika {
    private String nim;
    private int semester;
    private fakultas fakultas;
    public static int jumlahMahasiswa = 0;

    public mahasiswa(String nama, String email, String nim, int semester, fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        jumlahMahasiswa++;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Biaya UKT: Rp" + hitungUKT());
    }
}
