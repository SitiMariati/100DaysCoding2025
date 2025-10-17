package pkg100_days;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ketikkan angka pertama : ");
        int a = in.nextInt();

        System.out.print("Ketikkan operator  *, +, -, /, : ");
        char operator = in.next().charAt(0);

        System.out.print("Ketikkan angka Kedua : ");
        int b = in.nextInt();

        if (operator == '+') {
            System.out.println("Hasil : " + (a + b));
        } else if (operator == '-') {
            System.out.println("Hasil : " + (a - b));

        } else if (operator == '*') {
            System.out.println("Hasil : " + (a * b));
        } else if (operator == '/') {
            System.out.println("Hasil : " + (a / b));
        } 
    }
}
