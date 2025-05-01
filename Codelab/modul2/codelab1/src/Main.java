// Kelas Utama (Main) yang akan menjalankan program.
public class Main {
    public static void main(String[] args) {
        //Membuat objek hewan1 dan hewan 2 dengan nama, jenis, dan suara
        Hewan hewan1 = new Hewan("singa", "Mamalia", "rawrrr");

        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "pinjam 100k");

        // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan1
        hewan1.tampilkanInfo();
        // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan2
        hewan2.tampilkanInfo();
    }
}
