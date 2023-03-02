/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author acer
 */
public class Pendaftaran {
    public static void main(String[] args){
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Frentyusmelia";
        mhs.nobp = "2101091005";
        mhs.kelas = "MI2B";
        mhs.prodi = "MI";
        mhs.jurusan ="Teknologi Informasi";
        
        System.out.println("Nama   : " +mhs.nama+ "\n"
                + "No BP  : "+mhs.nobp+"\n"
                        + "Kelas  : "+mhs.kelas+"\n"
                        + "Prodi  : "+mhs.prodi+"\n"
                        + "Jurusan : "+mhs.jurusan);
    }
    
}
