package pkg100_days;

import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama Akun : ");
        String nmakun = in.nextLine();

        System.out.print("Buat Kata Sandi : ");
        String sandibru = in.nextLine();
        
        String msk_akun;
        String password;
        do {
            System.out.print("Masukkan Username : ");
            msk_akun = in.nextLine();

            System.out.print("Masukkan Password : ");
            password = in.nextLine();

            if (!msk_akun.equals(nmakun) || !password.equals(sandibru)) {
                System.out.println("Nama Akun atau Password Salah! Coba lagi. \n");
            }
        } while (!msk_akun.equals(nmakun) || !password.equals(sandibru));

        System.out.println("Login Berhasil");
        System.out.println("Selamat Datang," + msk_akun);
    }

}
