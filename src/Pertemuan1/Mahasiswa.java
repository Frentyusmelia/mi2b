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
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
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
        
        System.out.println(" ");
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Winni Dwi Yanti";
        mhs1.nobp = "2101091021";
        mhs1.kelas = "EL2B";
        mhs1.prodi = "EL";
        mhs1.jurusan ="Teknik Elektro";
        
        System.out.println("Nama   : " +mhs1.nama+ "\n"
                + "No BP  : "+mhs1.nobp+"\n"
                        + "Kelas  : "+mhs1.kelas+"\n"
                        + "Prodi  : "+mhs1.prodi+"\n"
                        + "Jurusan : "+mhs1.jurusan);
        
        
    }
    
}
