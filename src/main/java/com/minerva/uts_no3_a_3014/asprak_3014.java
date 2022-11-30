/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minerva.uts_no3_a_3014;

/**
 *
 * @author VIOLA GITASYA
 */
public class asprak_3014 extends mahasiswa_3014{
    String nama;
    String nim;
    String jurusan;
    int ipk;
    int unit;
    int jam;
    int pendapatan;
    public void dataasprak(){
        System.out.println("Jumlah unit : "+unit);
        System.out.println("Jam kerja : "+jam);
    }
    public double pendapatan(){
        return pendapatan = jam*50000;
    }
}
