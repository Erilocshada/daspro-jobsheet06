
import java.util.Scanner;

public class TugasPelatihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3, terbesar1, 
terbesar2, terbesar3; 
 
    System.out.print("Masukkan Bilangan Pertama : "); 
    bilangan1 = sc.nextInt(); 
    System.out.print("Masukkan Bilangan Kedua : "); 
    bilangan2 = sc.nextInt(); 
    System.out.print("Masukkan Bilangan Ketiga : "); 
    bilangan3 = sc.nextInt(); 
 
    if (bilangan1 >= bilangan2 && bilangan1 >= bilangan3) { 
        terbesar1 = bilangan1; 
        if (bilangan2 >= bilangan3) { 
            terbesar2 = bilangan2; 
            terbesar3 = bilangan3; 
        }else { 
            terbesar2 = bilangan3; 
            terbesar3 = bilangan2; 
        } 
    }else if (bilangan2 >= bilangan1 && bilangan2 >= 
bilangan3) { 
        terbesar1 = bilangan2; 
        if (bilangan1 >= bilangan3) { 
            terbesar2 = bilangan1; 
            terbesar3 = bilangan3; 
            }else { 
                terbesar2 = bilangan3; 
                terbesar3 = bilangan1; 
            } 
        }else { 
            terbesar1 = bilangan3; 
            if (bilangan1 >= bilangan2) { 
                terbesar2 = bilangan1; 
                terbesar3 = bilangan2; 
            }else { 
                terbesar2 = bilangan2; 
                terbesar3 = bilangan1; 
            } 
        } 
     
        System.out.println("Member Terbesar ke  satu : " + 
    terbesar1); 
        System.out.println("Member Terbesar ke  dua : " + 
    terbesar2); 
        System.out.println("Member Terbesar ke  tiga : " + 
    terbesar3);
        }
    }
