package konversinilai_07342;
import java.util.Scanner;
public class KonversiNilai_07342 {

    public static void main(String[] args) {
        int nilai_07342, pil_07342;
        Scanner Nilai_07342 = new Scanner (System.in);
        System.out.println("1. Konversi Nilai \n2.Log out");
        System.out.print("Masukan pilihan Anda (");
         for (int i =1; i<=2; i++)
        {
            System.out.print(i+ ", ");          
        }
        System.out.print("): ");
        pil_07342=Nilai_07342.nextInt();
        switch(pil_07342)
        {
            case 1 :
            {
                System.out.print("Masukan nilai Anda : ");
        nilai_07342 = Nilai_07342.nextInt();
        if (nilai_07342 < 60){
            System.out.println("E");
        }
        else if (nilai_07342 < 70 && nilai_07342 >= 60){
            System.out.println("D");
        }
        else if (nilai_07342 < 80  && nilai_07342 >= 70){
            System.out.println("C");
        }
        else if (nilai_07342 <= 90  && nilai_07342 >= 80){
            System.out.println("B");
        }
        else if (nilai_07342 <100  && nilai_07342 >= 91){
            System.out.println("A");
        }
        if (nilai_07342<75){
            System.out.println("TIDAK LULUS");
        }
        else {
            System.out.println("LULUS");
        }
                 break;
            }
            case 2 :
            {
                System.out.println("Selesai");
                break;
            }
            default :
                System.out.println("Pilihan tidak ada ");
}
}
}