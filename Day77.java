package pkg100_days;

public class Day77 {

    public static void main(String[] args) {

        String kalimat = " Coding Day 77  ";

        String mthodSubstring = kalimat.substring(6, 7);

        String tkr = kalimat.replace("Day", "Hari");

        String method_trm = kalimat.trim();

        System.out.println("Kalimat Asli : " + kalimat);
        System.out.println("Hasil method substring : " + mthodSubstring);
        System.out.println("Hasil method replace : " + tkr);
        System.out.println("Hasil method trim : " + method_trm);

    }

}
