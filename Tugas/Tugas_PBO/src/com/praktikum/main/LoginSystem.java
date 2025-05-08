package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        User user1 = new Admin("Faul", "138", "admin138", "pw138");
        User user2 = new Mahasiswa("faul", "138");

        while (true) {
            System.out.println("----------erere----------");
            System.out.println("Pilih Role Anda: ");
            System.out.println("1. Admin (OP)");
            System.out.println("2. Mahasiswa (bot)");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihan = scan.nextInt();
            scan.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Username: ");
                String username = scan.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scan.nextLine();

                if (user1.login(username, password)) {
                    user1.displayInfo();
                    user1.dispLayAppMenu();
                } else {
                    System.out.println("Login com.praktikum.users.Admin Gagal Mas!! Kayaknya Username atau Password salah deh. ");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan Username: ");
                String nama = scan.nextLine();
                System.out.print("Masukkan Password: ");
                String nim = scan.nextLine();

                if (user2.login(nama, nim)) {
                    user2.displayInfo();
                    user2.dispLayAppMenu();
                } else {
                    System.out.println("Login com.praktikum.users.Mahasiswa Gagal!! Nama atau Nim salah. ");
                }

            } else if (pilihan == 3) {
                System.out.println("Keluar dari sistem. Terimakasih!");
                break;
            } else {
                System.out.println("Inputan tidak valid! Pilih antara (1//3)");
            }

        }
    }
}