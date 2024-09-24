import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
  
        System.out.println("Berapa Objek Yang Dibuat? (MAX 10)");
        int jumlah = in.nextInt();
        
          //Buat looping untuk mengulang membuat objek CD atau //DVD
        System.out.println("CD atau Dv?  ");
        String pilihan = in.next();

        //Kondisi
        if (pilihan.equals("CD")) {
            cd c1 = new cd();
            c1.print();
        } else if (pilihan.equals("DVD")) {
            dvd d1 = new dvd();
            d1.print();
        } else {
            System.out.println("Input Salah. ");
        }
    
    }
    
}
