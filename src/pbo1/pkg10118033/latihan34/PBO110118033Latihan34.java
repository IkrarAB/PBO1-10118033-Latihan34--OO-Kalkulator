
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program kalkulator
 *  
 */

package pbo1.pkg10118033.latihan34;

import java.util.Scanner;

public class PBO110118033Latihan34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kalkulator kalkulator1 = new Kalkulator();
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan angka ke-1 : ");
        kalkulator1.value1 = sc.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        kalkulator1.value2 = sc.nextDouble();
        System.out.println();
        System.out.println("Hasil pertambahan : "+kalkulator1.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalkulator1.kurangBilangan());
        System.out.println("Hasil Perkalian   : "+kalkulator1.kaliBilangan());
        System.out.println("Hasil Pembagian   : "+kalkulator1.bagiBilangan());
        System.out.println("Hasil Sisa        : "+kalkulator1.sisaBilangan());
        System.out.println("(Developed By : Ikrar AB)");
    }
}
