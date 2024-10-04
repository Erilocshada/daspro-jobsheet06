import java.util.Scanner;

public class Pemilihan2Percobaan1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan Tahun : ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100 ) != 0) {
                System.out.println("Tahun "+ tahun+ " Tahun Kabisat");
            }
            else if (tahun % 400 == 0) {
                System.out.println("Tahun " + tahun + " Tahun Kabisat");
            }else {
                System.out.println("Tahun "+ tahun+ " Bukan Tahun Kabisat");
            }
        } else{
            System.out.println("Tahun "+ tahun+ " Bukan Tahun Kabisat");
        }
        sc.close();
    }
}