package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n === PERPUSTAKAAN ===");
        NonFiksi nonfiksi1 = new NonFiksi("aku cinta matematika", "sofyan", "ilmu gacor");
        Fiksi fiksi2 = new Fiksi("Dilan 1990", "ganjar", "horor");

        nonfiksi1.displayInfo();
        fiksi2.displayInfo();

        System.out.println("\n === DAFTAR ANGGOTA ===");

        Peminjaman anggota1 = new Anggota("faul", "D138");
        Peminjaman anggota2 = new Anggota("ciptoooo", "D123");

        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();

        System.out.println("\n === DAFTAR PEMINJAM ===");

        anggota1.pinjamBuku("aku cinta matematika");
        anggota2.pinjamBuku("Dilan 1990",7);

        System.out.println("\n === DAFTAR PENGEMBALIAN ===");

        anggota1.kembalikanBuku("aku cinta matematika");
        anggota1.kembalikanBuku("aku cinta matematika");
        anggota2.kembalikanBuku("Dilan 1990");

    }

}