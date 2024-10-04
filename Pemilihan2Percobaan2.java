
import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner absen20 = new Scanner(System.in);
        String member, metodepembayaran;
        int harga, menu;
        double totalBayar, diskon;

        System.out.println("-----------------------");
        System.out.println("=====MENU KAFE JTI=====");
        System.out.println("-----------------------");
        System.out.println("1. RiceBowl");
        System.out.println("2. IceTea");
        System.out.println("3. Paket Bundling (RiceBowl + IceTea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan Angka Menu :");
        menu = absen20.nextInt();
        absen20.nextLine();
        System.out.print("Apakah Punya Member (y/n) : ");
        member = absen20.nextLine();
        System.out.print("Metode Pembayaran (Cash/Qris) : ");
        metodepembayaran = absen20.nextLine();
        System.out.println("-------------------------------------");

        //Proses 
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (metodepembayaran.equalsIgnoreCase("Qris")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga RiceBowl : " + harga);
            }else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga IceTea : " + harga);
            }else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling : "+ harga);
            }else {
                System.out.println("Masukkan Pemilihan Menu dengan Benar");
                return;
            }
            totalBayar = harga - (harga*diskon);
            totalBayar = totalBayar - 1000 ;
            System.out.println("Total Bayar Setelah dskon : " + totalBayar);
            }else{
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga RiceBowl : " + harga);
                }else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga IceTea : " + harga);
                }else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Bundling : "+ harga);
                }else {
                    System.out.println("Masukkan Pemilihan Menu dengan Benar");
                    return;
                }
                totalBayar = harga - (harga*diskon);
                System.out.println("Total Bayar Setelah dskon : " + totalBayar);
            }
        }
        if (member.equalsIgnoreCase("n")) {
            if (metodepembayaran.equalsIgnoreCase("Qris")) {           
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga RiceBowl : " + harga);
            }else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga IceTea : " + harga);
            }else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling : "+ harga);
            }else {
                System.out.println("Masukkan Pemilihan Menu dengan Benar");
                return;
            }
            harga = harga - 1000;
            System.out.println("Total Bayar : " + harga);
        }else {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga RiceBowl : " + harga);
            }else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga IceTea : " + harga);
            }else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling : "+ harga);
            }else {
                System.out.println("Masukkan Pemilihan Menu dengan Benar");
                return;
            }
            System.out.println("Total Bayar : " + harga);
        }   
    }else {
        System.out.println("-------------------------------------");
    }
        absen20.close();
    }
}
