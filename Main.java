import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        ArrayList<Dosen> dosenList = new ArrayList<>();
        ArrayList<Jadwal> jadwalList = new ArrayList<>();
        ArrayList<Matakuliah> matkulList = new ArrayList<>();
        ArrayList<Ruangan> ruanganList = new ArrayList<>();

        mahasiswaList.add(new Mahasiswa("Afriza", "1", "Komputer"));
        mahasiswaList.add(new Mahasiswa("Muammar", "2", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Laksana", "3", "Komputer"));
        mahasiswaList.add(new Mahasiswa("Afriza1", "11", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Muammar1", "22", "Komputer"));
        mahasiswaList.add(new Mahasiswa("Laksana1", "33", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Afriza2", "111", "Komputer"));
        mahasiswaList.add(new Mahasiswa("Muammar2", "222", "Informatika"));
        mahasiswaList.add(new Mahasiswa("Laksana2", "333", "Komputer"));
        mahasiswaList.add(new Mahasiswa("Afriza3", "1111", "Informatika"));

        dosenList.add(new Dosen("Ade Chandra Nugraha", "1"));
        dosenList.add(new Dosen("Muhammad Rizqi S", "2"));
        dosenList.add(new Dosen("Santi Sundari", "3"));
        dosenList.add(new Dosen("Trisna Gelar A", "4"));
        dosenList.add(new Dosen("Irwan Setiawan", "5"));
        dosenList.add(new Dosen("Irawan Thamrin", "6"));
        dosenList.add(new Dosen("Yadhi Aditya P, ", "7"));
        dosenList.add(new Dosen("Zulkifli Arsyad", "8"));
        dosenList.add(new Dosen("Ade Hodijah", "9"));
        dosenList.add(new Dosen("Suprihanto", "10"));

        matkulList.add(new Matakuliah("BasisData TE"));
        matkulList.add(new Matakuliah("ALIN"));
        matkulList.add(new Matakuliah("PRPL TE"));
        matkulList.add(new Matakuliah("PBO PR"));
        matkulList.add(new Matakuliah("Proyek-3"));

        ruanganList.add(new Ruangan("D217-Kelas & D102-Lab. MT"));
        ruanganList.add(new Ruangan("D101-Kelas"));
        ruanganList.add(new Ruangan("D102-Lab. MT"));
        ruanganList.add(new Ruangan("D106-Lab. SDB"));


        jadwalList.add(new Jadwal(matkulList.get(0), dosenList.get(0), ruanganList.get(0), "Senin"));
        jadwalList.add(new Jadwal(matkulList.get(1), dosenList.get(1), ruanganList.get(1), "Selasa"));
        jadwalList.add(new Jadwal(matkulList.get(2), dosenList.get(2), ruanganList.get(2), "Rabu"));
        jadwalList.add(new Jadwal(matkulList.get(3), dosenList.get(8), ruanganList.get(3), "Kamis"));
        jadwalList.add(new Jadwal(matkulList.get(4), dosenList.get(4), ruanganList.get(3), "Jumat"));

        System.out.println("\nData Mahasiswa :");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
        }
        
        System.out.println("\n====================================");

        System.out.println("\nData Dosen :");
        for (Dosen dosen : dosenList) {
            System.out.println(dosen);
        }

        System.out.println("\n====================================");
        
        System.out.println("\nJadwal :");
        for (Jadwal jadwal : jadwalList) {
            System.out.println(jadwal);
            System.out.println("\n====================================");
        }
        
    }
}
