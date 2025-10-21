package pkg100_days;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ketikkan Nilai : ");
        int nilai = in.nextInt();

        if (nilai >= 90 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 75 && nilai <= 85) {
            System.out.println("B");
        } else if (nilai >= 65 && nilai <= 70) {
            System.out.println("C");
        } else if (nilai >= 50 && nilai <= 60) {
            System.out.println("D");
        } else if (nilai >= 35 && nilai <= 45) {
            System.out.println("E");
        } else {
            System.out.println("Nilai tidak Valid");
        }

    }

}
