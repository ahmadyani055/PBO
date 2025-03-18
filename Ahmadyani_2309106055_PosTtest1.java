import java.util.ArrayList;
import java.util.Scanner;

class Pasien {
    String idPasien;
    String nama;
    int usia;

    public Pasien(String idPasien, String nama, int usia) {
        this.idPasien = idPasien;
        this.nama = nama;
        this.usia = usia;
    }

    public void tampilkanData() {
        System.out.println("ID Pasien: " + idPasien + ", Nama: " + nama + ", Usia: " + usia);
    }
}

class Dokter {
    String idDokter;
    String nama;
    String spesialisasi;

    public Dokter(String idDokter, String nama, String spesialisasi) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public void tampilkanData() {
        System.out.println("ID Dokter: " + idDokter + ", Nama: " + nama + ", Spesialisasi: " + spesialisasi);
    }
}

public class Ahmadyani_2309106055_PosTtest1 {
    static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    static ArrayList<Dokter> daftarDokter = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nMenu CRUD:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Pasien");
            System.out.println("3. Hapus Pasien");
            System.out.println("4. Tambah Dokter");
            System.out.println("5. Tampilkan Dokter");
            System.out.println("6. Hapus Dokter");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1 -> tambahPasien();
                case 2 -> tampilkanPasien();
                case 3 -> hapusPasien();
                case 4 -> tambahDokter();
                case 5 -> tampilkanDokter();
                case 6 -> hapusDokter();
                case 7 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);
    }

    static void tambahPasien() {
        System.out.print("Masukkan ID Pasien: ");
        String idPasien = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Usia: ");
        int usia = scanner.nextInt();
        scanner.nextLine();
        daftarPasien.add(new Pasien(idPasien, nama, usia));
        System.out.println("Pasien berhasil ditambahkan!");
    }

    static void tampilkanPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
        } else {
            for (Pasien p : daftarPasien) {
                p.tampilkanData();
            }
        }
    }

    static void hapusPasien() {
        System.out.print("Masukkan ID Pasien yang ingin dihapus: ");
        String idPasien = scanner.nextLine();
        daftarPasien.removeIf(p -> p.idPasien.equals(idPasien));
        System.out.println("Pasien dengan ID " + idPasien + " telah dihapus.");
    }

    static void tambahDokter() {
        System.out.print("Masukkan ID Dokter: ");
        String idDokter = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Spesialisasi: ");
        String spesialisasi = scanner.nextLine();
        daftarDokter.add(new Dokter(idDokter, nama, spesialisasi));
        System.out.println("Dokter berhasil ditambahkan!");
    }

    static void tampilkanDokter() {
        if (daftarDokter.isEmpty()) {
            System.out.println("Belum ada data dokter.");
        } else {
            for (Dokter d : daftarDokter) {
                d.tampilkanData();
            }
        }
    }

    static void hapusDokter() {
        System.out.print("Masukkan ID Dokter yang ingin dihapus: ");
        String idDokter = scanner.nextLine();
        daftarDokter.removeIf(d -> d.idDokter.equals(idDokter));
        System.out.println("Dokter dengan ID " + idDokter + " telah dihapus.");
    }
}
