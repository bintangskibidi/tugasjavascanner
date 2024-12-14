import java.util.Scanner;
// import java.util.arrays;
// import java.util.Collections;
// import java.util.list;

public class index {
    public static void main(String[] args) {
            //  // sout dan sou
            //  System.out.println("Hallo");
            //  System.out.println("Hallo 1");
            //  System.out.print("Hallo");
            //  System.out.print("Hallo");
         
            //  String name ="Test";
            //  Integer angka = 1;
            //  Float desimal = (float) 1.1;
            //  Boolean testing = true;
            //  Integer test = 1;
         
            //  // test = 2;
         
            //  // var sum = test + desimal;
            //  Integer angka1 = 1;
            //  int angka2=1;
            //  System.out.print(angka1);
            //  System.out.print(angka2);

            Scanner sc = new Scanner(System.in);
        String nama;
        System.out.print("Nama kamu siapa: ");
        nama = sc.next();
        System.out.println("Nama Saya " + nama);
        
        int menu;
        do {
            System.out.println("Pilih Menu: 0.Kalkulator, 2.Keluar");
            menu = sc.nextInt();
            
            if (menu == 0) {
                System.out.print("Masukan angka pertama: ");
                int angka1 = sc.nextInt();
                System.out.print("Masukan angka kedua: ");
                int angka2 = sc.nextInt();
                int hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                
                if (hasil % 2 == 0) {
                    System.out.println("Angka genap");
                } else {
                    System.out.println("Angka ganjil");
                }
            } else if (menu == 2) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (menu != 2);
        
        sc.close();
    }
}
