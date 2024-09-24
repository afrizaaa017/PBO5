public class Jadwal {
    private Matakuliah matakuliah;
    private Dosen dosen;
    private Ruangan ruangan;
    private String hari;

    public Jadwal(Matakuliah matakuliah, Dosen dosen, Ruangan ruangan, String hari) {
        this.matakuliah = matakuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
        this.hari = hari;
    }

    @Override
    public String toString() {
        return "Hari: " + hari + "\n" +
               "Matakuliah: " + matakuliah + "\n" +
               "Dosen: " + dosen + "\n" +
               "Ruangan: " + ruangan;
    }
}
