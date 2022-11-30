/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minerva.uts_no3_a_3014;

/**
 *
 * @author VIOLA GITASYA
 */
public class studentstaff_3014 extends mahasiswa_3014 {
    String nama;
    String nim;
    String jurusan;
    int ipk;
    String mk;
    int jumlahp;
    int pendapatan;
    public void datastaff(){
        System.out.println("MK Asistensi : "+mk);
        System.out.println("Jumlah pertemuan : "+jumlahp);
    }
    public double pendapatan(){
        return pendapatan = jumlahp*30000;
    }
}
