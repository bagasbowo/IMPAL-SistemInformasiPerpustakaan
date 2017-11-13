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

import static java.lang.System.exit;
import java.util.Scanner;

public class tambah_mahasiswa {
    public void addMhs(String kdAnggota, String nama, String telp, String pilih){
        Scanner add = new Scanner(System.in);
        int nilai=0;
        System.out.println("=======================");
        System.out.println("     Tambah Anggota    ");
        System.out.println("=======================");
        System.out.println("");
        for(int i = 0; i<nilai+1; i++) {    
            System.out.println("Kode Anggota : ");
            kdAnggota = add.next();
            System.out.println("Nama         : ");
            nama = add.next();
            System.out.println("No telepon   : ");
            telp = add.next();
        
            nilai=nilai+1;
        }
        System.out.println("Ingin menambahkan data lagi? (Y/N) ");
        pilih = add.next();
        if(("Y").equals(pilih) && ("y").equals(pilih)){
            System.out.println("Kode Anggota : ");
            kdAnggota = add.next();
            System.out.println("Nama         : ");
            nama = add.next();
            System.out.println("No telepon   : ");
            telp = add.next();
        }
        else {
            exit(0);
        }
    }
}
    
