/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author acer
 */
public class Mobil {
    
    int tahunPembuatan;
    String namaMobil;
    
    public Mobil(int tahun, String nama){
        tahunPembuatan = tahun;
        namaMobil = nama;
    }
    
    public static void main(String [] args){
        Mobil m = new Mobil(2020, "Avanza");
        System.out.println("Nama Mobil : "+m.namaMobil + 
                "\n"+ "Tahun Pembuatan : "+m.tahunPembuatan);
    }
    
}
