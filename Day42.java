package pkg100_days;

public class Day42 {
    public static void main(String[] args) {
        
        double gajipokok = 3_000_000;
        double persen_tunjangan = 0.1;
        double persen_pajak = 0.05;
        
        
        double tunjangan = persen_tunjangan * gajipokok ;
        double gaji_kotor = gajipokok + tunjangan;
        double potongan_pajak = persen_pajak * gaji_kotor;
        double gaji_bersih = gaji_kotor - potongan_pajak;
        
        
        System.out.println("Tunjangan yang diterima : " + tunjangan);
        System.out.println("Gaji kotor yang di dapatkan : " + gaji_kotor);
        System.out.println("Gaji setelah di potong Pajak : " + potongan_pajak);
        System.out.println("Gaji bersih yang di dapatkan : " + gaji_bersih);
    }
    
}
