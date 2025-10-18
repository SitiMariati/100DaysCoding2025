package evaluasi_2;

import java.util.Scanner;

public class Soal_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Gender : ");
        String Gender = in.nextLine();
        
        System.out.print("Ketikkan Umur : ");
        int umur = in.nextInt();
        
        if(Gender.equalsIgnoreCase("Laki-laki")){
        if(umur >= 18 && umur <=40){
            System.out.println("Anda seorang " + Gender +  " berumur "  + umur + " tahun, sudah dewasa");
        }else if(umur >=14 && umur <= 17){
            System.out.println("Anda seorang " + Gender +  " berumur "  + umur + " tahun, masih remaja");
        }else{
            System.out.println("Anda seorang " + Gender +  " berumur "  + umur + " tahun, masih remaja");
        }
        }
    }
    
}
