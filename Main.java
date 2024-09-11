public class Main {
    public static void main(String[] args) {
        // Membuat instance (objek) mahasiswa1 dari class Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Budi Santoso";
        mahasiswa1.nim = 27.9048903;
        mahasiswa1.jurusan = "Teknik Informatika";
        
        // Membuat instance (objek) mahasiswa2 dari class Mahasiswa
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Habib Azizul Haq";
        mahasiswa2.nim = 27.8908205;
        mahasiswa2.jurusan = "Sistem Informasi";

        // Memanggil method infoMahasiswa untuk menampilkan informasi mahasiswa
        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.infoMahasiswa();
        
        System.out.println("\nInformasi Mahasiswa 2:");
        mahasiswa2.infoMahasiswa();
    }
}
