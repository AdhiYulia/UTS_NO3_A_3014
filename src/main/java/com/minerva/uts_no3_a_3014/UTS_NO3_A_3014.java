/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.minerva.uts_no3_a_3014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author VIOLA GITASYA
 */
public class UTS_NO3_A_3014 {
    public static void main(String[] args) {
        studentstaff_3014 s1 = new studentstaff_3014();
        asprak_3014 a1= new asprak_3014();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Data Student staff");
            System.out.println("Nama : ");
            s1.nama = br.readLine();
            System.out.println("NIM : ");
            s1.nim = br.readLine();
            System.out.println("Jurusan : ");
            s1.jurusan = br.readLine();
            System.out.println("IPK : ");
            s1.ipk = Integer.parseInt(br.readLine());
            System.out.println("Jumlah pertemuan : ");
            s1.jumlahp = Integer.parseInt(br.readLine());
            System.out.println("MK Asistansi : ");
            s1.jurusan = br.readLine();
           
            System.out.println();
            
            System.out.println("Asisten Praktikum");
            System.out.println("Nama : ");
            a1.nama = br.readLine();
            System.out.println("NIM : ");
            a1.nim = br.readLine();
            System.out.println("Jurusan : ");
            a1.jurusan = br.readLine();
            System.out.println("IPK : ");
            a1.ipk = Integer.parseInt(br.readLine());
            System.out.println("Jumlah unit : ");
            a1.unit = Integer.parseInt(br.readLine());
            System.out.println("Jam kerja : ");
            a1.jam = Integer.parseInt(br.readLine());
            
            System.out.println("=========== Data Student staff ===========");
            s1.tampildata();
            s1.datastaff();
            s1.pendapatan();
            
            System.out.println();
            
            System.out.println("=========== Asisten Praktikum ===========");
            
            a1.tampildata();
            a1.dataasprak();
            a1.pendapatan();
            
            System.out.println();
                   
        } catch (IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}
