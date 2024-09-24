public class Ruangan {
    private String kodeRuangan;

    public Ruangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    @Override
    public String toString() {
        return "Kode Ruangan: " + kodeRuangan;
    }
}
