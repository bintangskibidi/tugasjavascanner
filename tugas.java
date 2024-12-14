import java.util.Scanner;

class MenuExample {
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        
        // Login
        String username = "Administrator";
        String pin = "123456789";

        System.out.print("Masukkan Nama: ");
        String inputName = sc.nextLine();
        
        String inputPassword;
        while (true) {
            System.out.print("Masukkan Password : ");
            inputPassword = sc.nextLine();
            if (inputPassword.length() > 4) {
                break;
            } else {
                System.out.println("Password harus terdiri dari lebih dari 5 karakter. Silakan coba lagi.");
            }
        }
        
        System.out.print("Masukkan PIN: ");
        String inputPin = sc.nextLine();

        if (!inputName.equals(username) || !inputPin.equals(pin)) {
            System.out.println("Login gagal! Nama atau PIN salah.");
            sc.close();
            return;
        }

        System.out.println("Login berhasil! Selamat datang, " + username + "!");
        
        while (true) {
            System.out.println("<==Silahkan Pilih Menu==>");
            System.out.println(" 1. Bangun Ruang/Datar");
            System.out.println(" 2. Konversi");
            System.out.println(" 3. Secret Menu");
            System.out.println(" 4. Exit ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 -> bangunRuangDatar(sc);
                case 2 -> konversi(sc);  
                case 3 -> secretMenu(sc); 
                case 4 -> {
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;
                }
                default -> System.out.println("RA ONO BLOKK!!   ");
            }
        }
    }

    public void bangunRuangDatar(Scanner sc) {
        while (true) {
            System.out.println("<== Bangun Ruang Datar ==>");
            System.out.println(" Silahkan Pilih Rumus :");
            System.out.println(" 1. Luas (Meter Kuadrat)");
            System.out.println(" 2. Volume (Liter)");
            System.out.println(" 3. Exit");
            int pilihan = sc.nextInt();
            if (pilihan == 3) break;

            switch (pilihan) {
                case 1 -> luas(sc);
                case 2 -> volume(sc);  
                default -> System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    public void luas(Scanner sc) {
        while (true) {
            System.out.println("Silahkan Pilih Menu:");
            System.out.println(" 1. Persegi Panjang");
            System.out.println(" 2. Persegi");
            System.out.println(" 3. Segitiga");
            System.out.println(" 4. Lingkaran");
            System.out.println(" 5. Exit");
            int pilihan = sc.nextInt();
            if (pilihan == 5) break;

            switch (pilihan) {
                case 1 -> hitungLuasPersegiPanjang(sc);
                case 2 -> hitungLuasPersegi(sc);
                case 3 -> hitungLuasSegitiga(sc);
                case 4 -> hitungLuasLingkaran(sc);
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public void hitungLuasPersegiPanjang(Scanner sc) {
        System.out.print("Masukkan panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = sc.nextDouble();
        System.out.println("Luas Persegi Panjang: " + (panjang * lebar));
    }

    public void hitungLuasPersegi(Scanner sc) {
        System.out.print("Masukkan sisi: ");
        double sisi = sc.nextDouble();
        System.out.println("Luas Persegi: " + (sisi * sisi));
    }

    public void hitungLuasSegitiga(Scanner sc) {
        System.out.print("Masukkan alas: ");
        double alas = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();
        System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi));
    }

    public void hitungLuasLingkaran(Scanner sc) {
        System.out.print("Masukkan jari-jari: ");
        double jariJari = sc.nextDouble();
        System.out.println("Luas Lingkaran: " + (Math.PI * jariJari * jariJari));
    }

    public void volume(Scanner sc) {
        while (true) {
            System.out.println("Pilihan Menu:");
            System.out.println(" 1. Balok");
            System.out.println(" 2. Kubus");
            System.out.println(" 3. Bola");
            System.out.println(" 4. Exit");
            int pilihan = sc.nextInt();
            if (pilihan == 4) break;

            switch (pilihan) {
                case 1 -> hitungVolumeBalok(sc);
                case 2 -> hitungVolumeKubus(sc);
                case 3 -> hitungVolumeBola(sc);
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public void hitungVolumeBalok(Scanner sc) {
        System.out.print("Masukkan panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();
        System.out.println("Volume Balok: " + (panjang * lebar * tinggi));
    }

    public void hitungVolumeKubus(Scanner sc) {
        System.out.print("Masukkan sisi: ");
        double sisi = sc.nextDouble();
        System.out.println("Volume Kubus: " + (Math.pow(sisi, 3)));
    }

    public void hitungVolumeBola(Scanner sc) {
        System.out.print("Masukkan jari-jari: ");
        double jariJari = sc.nextDouble();
        System.out.println("Volume Bola: " + ((4.0/3.0) * Math.PI * Math.pow(jariJari, 3)));
    }

        
    public void konversi(Scanner sc) {
        while (true) {
            System.out.println("Pilih Menu di bawah ini : ");
            System.out.println(" 1. Derajat");
            System.out.println(" 2. Panjang (meter)");
            System.out.println(" 3. Berat (gram)");
            System.out.println(" 4. Exit");
            int pilihan = sc.nextInt();
            if (pilihan == 4) break;

            switch (pilihan) {
                case 1 -> derajat(sc);
                case 2 -> panjang(sc);  
                case 3 -> berat(sc); 
                default -> System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    public void derajat(Scanner sc) {
        while (true) {
            System.out.println("\nPilih satuan di bawah ini:");
            System.out.println("1. Celcius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Reamur");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1 -> celcius(sc);
                case 2 -> fahrenheit(sc);
                case 3 -> reamur(sc);
                case 4 -> {
                    System.out.println("Kembali ke menu utama.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    public void celcius(Scanner sc) {
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = sc.nextDouble();
        System.out.printf("%.2f Celcius = %.2f Fahrenheit%n", celcius, (celcius * 9 / 5) + 32);
        System.out.printf("%.2f Celcius = %.2f Reamur%n", celcius, celcius * 4 / 5);
    }

    public void fahrenheit(Scanner sc) {
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.printf("%.2f Fahrenheit = %.2f Celcius%n", fahrenheit, (fahrenheit - 32) * 5 / 9);
        System.out.printf("%.2f Fahrenheit = %.2f Reamur%n", fahrenheit, (fahrenheit - 32) * 4 / 9);
    }

    public void reamur(Scanner sc) {
        System.out.print("Masukkan suhu dalam Reamur: ");
        double reamur = sc.nextDouble();
        System.out.printf("%.2f Reamur = %.2f Celcius%n", reamur, reamur * 5 / 4);
        System.out.printf("%.2f Reamur = %.2f Fahrenheit%n", reamur, reamur * 9 / 4 + 32);
    }

    
    
    public void panjang(Scanner sc) {
        while (true) {
            System.out.println("Silahkan Pilih :");
            System.out.println(" 1. Kilometer");
            System.out.println(" 2. Hektometer");
            System.out.println(" 3. Dekameter");
            System.out.println(" 4. Desimeter");
            System.out.println(" 5. Sentimeter");
            System.out.println(" 6. Milimeter");
            System.out.println(" 7. Exit");
            
            int pilihan = sc.nextInt();
            if (pilihan == 7) break;
            
            System.out.print("Masukkan nilai dalam meter: ");
            double meter = sc.nextDouble();
            double hasil;

            switch (pilihan) {
                case 1 -> hasil = meter / 1000;
                case 2 -> hasil = meter / 100;
                case 3 -> hasil = meter / 10;
                case 4 -> hasil = meter * 10;
                case 5 -> hasil = meter * 100;
                case 6 -> hasil = meter * 1000;
                default -> {
                    System.out.println("Pilihan tidak valid.");
                    continue;
                }
            }
            System.out.println("Hasil: " + hasil);
        }
    }

    public void berat(Scanner sc) {
        while (true) {
            System.out.println("Silahkan Pilih :");
            System.out.println(" 1. Kilogram");
            System.out.println(" 2. Hektogram");
            System.out.println(" 3. Dekagram");
            System.out.println(" 4. Desigram");
            System.out.println(" 5. Sentigram");
            System.out.println(" 6. Miligram");
            System.out.println(" 7. Exit");
            
            int pilihan = sc.nextInt();
            if (pilihan == 7) break;
            
            System.out.print("Masukkan nilai dalam gram: ");
            double gram = sc.nextDouble();
            double hasil;

            switch (pilihan) {
                case 1 -> hasil = gram / 1000;
                case 2 -> hasil = gram / 100;
                case 3 -> hasil = gram / 10;
                case 4 -> hasil = gram * 10;
                case 5 -> hasil = gram * 100;
                case 6 -> hasil = gram * 1000;
                default -> {
                    System.out.println("Pilihan tidak valid.");
                    continue;
                }
            }
            System.out.println("Hasil: " + hasil);
        }
    }
    public void secretMenu(Scanner sc) {
        while (true) {
            System.out.println("Silahkan Masukkan Kode Unik : ");
            String kodeAkses = sc.next();  
            sc.nextLine();  

            if (!kodeAkses.equals("wedusmabur")) {
                System.out.println("Salah ya kode nya wkwk");
                continue;
            }

            System.out.println("Selamat Datang VIP!!");
            while (true) {
                System.out.println("Silahkan Pilih Menu Rahasia : ");
                System.out.println(" 1. Uppercase");
                System.out.println(" 2. Lowercase");
                System.out.println(" 3. Reverse");
                System.out.println(" 4. Exit");
                System.out.print("Masukkan pilihan: ");
                int pilihan = sc.nextInt();
                sc.nextLine();  

                if (pilihan == 4) {
                    System.out.println("Keluar dari menu.");
                    return; 
                }

                System.out.print("Masukkan teks: ");
                String teks = sc.nextLine(); 

                switch (pilihan) {
                    case 1 -> System.out.println("Teks Uppercase: " + teks.toUpperCase());
                    case 2 -> System.out.println("Teks Lowercase: " + teks.toLowerCase());
                    case 3 -> System.out.println("Teks Reverse: " + reverseWords(teks));
                    default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
    }

    public String reverseWords(String teks) {
        String[] words = teks.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        MenuExample menuExample = new MenuExample();
        menuExample.showMenu();
    }
}
