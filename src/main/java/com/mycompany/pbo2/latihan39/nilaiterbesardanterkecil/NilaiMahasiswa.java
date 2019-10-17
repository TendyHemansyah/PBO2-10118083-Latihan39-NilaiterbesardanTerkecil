/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan39.nilaiterbesardanterkecil;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tendy
 * Nama     : Tendy Hermansyah
 * Kelas    : PBO2
 * Nim      : 10118083
 * Deskripsi Tugas : Nilai Terbesar dan Terkecil
 */
public class NilaiMahasiswa {
    private final List <Integer> nilai = new ArrayList();
    private int JumlahMahasiswa;
    private int terbesar;
    private int terkecil;

    public void setNilai(int nilai){
        this.nilai.add(nilai);
    }
    
    public int getJumlahMahasiswa() {
        return JumlahMahasiswa;
    }

    public void setJumlahMahasiswa(int JumlahMahasiswa) {
        this.JumlahMahasiswa = JumlahMahasiswa;
    }
    
    private void hitungnilaiTerbesar(int idx){
        if(terbesar < nilai.get(idx))
            terbesar = nilai.get(idx);
    }
    
    private void hitungnilaiTerkecil(int idx){
        if(terkecil > nilai.get(idx))
            terkecil = nilai.get(idx);
    }
    
    public void tampilNilai(){
        System.out.println("\n===== Hasil Nilai Mahasiswa =====");
        terbesar = nilai.get(0);
        terkecil = nilai.get(0);
        
        for (int i = 0; i < nilai.size(); i++){
            hitungnilaiTerbesar(i);
            hitungnilaiTerkecil(i);
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = "
                    + nilai.get(i));
        }
        
        System.out.println("\nNilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);                
    }
}
