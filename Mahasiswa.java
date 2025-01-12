class Mahasiswa extends Person {
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        super(nama);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ",  Jurusan: " + jurusan ;
    }
    
}