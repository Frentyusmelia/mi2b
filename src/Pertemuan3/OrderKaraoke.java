/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class OrderKaraoke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Karaoke order = new Karaoke();
        
        String kodePesan,tglPesan,kodePelanggan;
        int lamaKaraoke;
        double tarif,diskon,total;
        
        System.out.print("Masukkan Kode Pesan : ");
        kodePesan=in.nextLine();
        System.out.print("Masukkan Tanggal Pesan : ");
        tglPesan=in.nextLine();
        System.out.print("Masukkan Kode Pelanggan: ");
        kodePelanggan=in.nextLine();
        System.out.print("Masukkan Lama Karaoke : ");
        lamaKaraoke=in.nextInt();
        System.out.print("\n\n");
        
        order.setKodePesan(kodePesan);
        order.setTglPesan(tglPesan);
        order.setKodePelanggan(kodePelanggan);
        order.setLamaKaraoke(lamaKaraoke);
        
        order.print();
        
    }
}
