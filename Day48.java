package pkg100_days;

import java.util.Scanner;

public class Day48 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hasil = 0;

        int angka_1 = 10;

        int angka_2 = 3;

        System.out.print("Ketikkan Operator *, +, -, /, % : ");
        char op = in.next().charAt(0);

        switch (op) {
            case '+':
                hasil = angka_1 + angka_2;
                break;

            case '*':
                hasil = angka_1 * angka_2;
                break;
            case '/':
                hasil = angka_1 / angka_2;
                break;

            case '-':
                hasil = angka_1 - angka_2;
                break;

            case '%':
                hasil = angka_1 % angka_2;
                break;

            default:
                System.out.println("Operator tidak valid");
                break;
        }
        System.out.println("Hasil Akhir : " + hasil);
    }

}
