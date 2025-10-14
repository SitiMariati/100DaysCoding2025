package pkg100_days;

import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ketikkan Bilangan :");
        int bilangan = in.nextInt();

        if (bilangan == 0) {
            System.out.println("Bilangan Nol");
        } else if (bilangan % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else if (bilangan % 2 != 0) {
            System.out.println("Bilangan Ganjil");
        }
    }

}
