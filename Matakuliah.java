public class Matakuliah {
    private String namaMatkul;

    public Matakuliah(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    @Override
    public String toString() {
        return "Nama Matakuliah: " + namaMatkul;
    }
}
