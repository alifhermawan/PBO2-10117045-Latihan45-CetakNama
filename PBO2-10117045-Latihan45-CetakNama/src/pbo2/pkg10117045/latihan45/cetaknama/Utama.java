package pbo2.pkg10117045.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk mencetak nama sesuai 
 * jumlah yang diinginkan
 */
public class Utama {
    
    public static void main(String[] args) {
        Printer pri =  new Printer();
        
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukan nama anda : ");
        pri.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali : ");
        pri.setJmlCetak(scn.nextInt());
        
        pri.cetak(pri.getNama());
        System.out.println("Hasil Cetak : ");
        pri.cetak(pri.getJmlCetak(), pri.getNama());
    }
    
}
