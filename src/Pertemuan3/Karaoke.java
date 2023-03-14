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
public class Karaoke {
    private String kodePesan;
    private String tglPesan;
    private String kodePelanggan; 
    private int lamaKaraoke;
    private double tarif;
    private double diskon;
    private double total;

    public String getKodePesan() {
        return kodePesan;
    }

    public void setKodePesan(String kodePesan) {
        this.kodePesan = kodePesan;
    }

    public String getTglPesan() {
        return tglPesan;
    }

    public void setTglPesan(String tglPesan) {
        this.tglPesan = tglPesan;
    }
    
    public String getKodePelanggan() {
        return kodePelanggan;
    }
    
    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public int getLamaKaraoke() {
        return lamaKaraoke;
    }

    public void setLamaKaraoke(int lamaKaraoke) {
        if (lamaKaraoke <= 2){
            tarif=100000;
            diskon=((tarif * 2)/100);
            total=(tarif - diskon);
        }
        else if (lamaKaraoke == 3 && lamaKaraoke <= 5){
            tarif=100000;
            diskon=((tarif * 5)/100);
            total=(tarif - diskon);
        }
        else{
            System.out.println(" Mohon Maaf Lama Karaoke Tidak Tersedia");
        }
        this.lamaKaraoke = lamaKaraoke;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

     public void print(){
       System.out.println("\tSelamat Datang Di Karaoke TiNty");
       System.out.println("**********************************************************");
       System.out.println("Kode Pesan           : "+kodePesan);
       System.out.println("Tanggal Pesan        : "+tglPesan);
       System.out.println("Kode Pelanggan       : "+kodePelanggan);
       System.out.println("Lama Karaoke         : "+lamaKaraoke);
       System.out.println("Tarif                :Rp  "+tarif);
       System.out.println("Diskon               :Rp  "+diskon);
       System.out.println("Total Pembayaran     :Rp  "+total);
       System.out.println("\n**********************************************************");
   }
    
}
