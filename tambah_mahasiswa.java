/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apaini;

/**
 *
 * @author Ananda
 */

import java.util.Scanner;

public class tambah_mahasiswa {
    Scanner add = new Scanner(System.in);
    int data_mhs=add.nextInt();
    String kdAnggota[] = new String[data_mhs];
    String nama[] = new String[data_mhs];
    String nim[] = new String[data_mhs];
    String jur[] = new String[data_mhs];
    String fak[] = new String[data_mhs];
    String telp[] = new String[data_mhs];
    public void addMhs(){
        System.out.println("=======================");
        System.out.println("     Tambah Anggota    ");
        System.out.println("=======================");
        System.out.println("");
        for(int i = 1; i<=data_mhs; i++) {
            System.out.println("Data mahasiswa ke -  "+i);
            System.out.println("Kode Anggota : ");
            kdAnggota[i-1] = add.next();
            System.out.println("Nama         : ");
            nama[i-1] = add.next();
            System.out.println("NIM          : ");
            nim[i-1] = add.next();
            System.out.println("Jurusan         : ");
            jur[i-1] = add.next();
            System.out.println("Fak          : ");
            fak[i-1] = add.next();
            System.out.println("No telepon   : ");
            telp[i-1] = add.next();
            System.out.println("");
        }
    }
    
    public void showdata(){
        for (int i=1;i<=data_mhs;i++){
            System.out.println(i);
            System.out.println("Kode Anggota     : "+kdAnggota[i-1]);
            System.out.println("Nama             : "+nama[i-1]);
            System.out.println("NIM              : "+nim[i-1]);
            System.out.println("Jurusan          : "+jur[i-1]);
            System.out.println("Fakultas         : "+fak[i-1]);
            System.out.println("Telepon          : "+telp[i-1]);
    }
    }
}