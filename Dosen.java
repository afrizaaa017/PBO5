class Dosen extends Person {
    private String nip;

    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + " , NIP: " + nip ;
    }
}
