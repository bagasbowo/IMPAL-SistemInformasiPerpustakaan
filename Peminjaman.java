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

public class peminjaman {
    Scanner add = new Scanner(System.in);
    int data_pinjam=add.nextInt();
    String kdAnggota[] = new String[data_pinjam];
    String noPinjam[] = new String[data_pinjam];
    String nama[] = new String[data_pinjam];
	String kodeBuku[] = new String[data_pinjam];
	String judulBuku[] = new String[data_pinjam];
	String tglPinjam[] = new String[data_pinjam];
	String tglKembali[] = new String[data_pinjam];
	
    public void addPinjam(){
        System.out.println("==========================");
        System.out.println("     Tambah Peminjaman    ");
        System.out.println("==========================");
        System.out.println("");
        for(int i = 1; i<=data_pinjam; i++) {
            System.out.println("Data peminjaman ke -  "+i);
			System.out.println("No Pinjam	 : ");
            noPinjam[i-1] = add.next();
            System.out.println("Kode Anggota : ");
            kdAnggota[i-1] = add.next();
            System.out.println("Nama         : ");
            nama[i-1] = add.next();
			if (array_rekap[kdAnggota] == data_pinjam[kdAnggota])
				System.out.println("Data ditemukan");
			else
				System.out.println("Data tidak ditemukan");			
			System.out.println("Kode buku	 : ");
            kodeBuku[i-1] = add.next();
			System.out.println("Judul buku	 : ");
            judulBuku[i-1] = add.next();
			if (array_rekap[kodeBuku] == data_pinjam[kodeBuku])
				System.out.println("Data ditemukan");
			else
				System.out.println("Data tidak ditemukan");	
            System.out.println("");
			System.out.println("Tanggal Pinjam	 : ");
            tglPinjam[i-1] = add.next();
			System.out.println("Tanggal Kembali	 : ");
            tglKembali[i-1] = add.next();
        }
    }
    
    public void showdata(){
        for (int i=1;i<=data_pinjam;i++){
            System.out.println(i);
            System.out.println("Nomor Pinjam     : "+noPinjam[i-1]);
			System.out.println("Kode Anggota     : "+kdAnggota[i-1]);
            System.out.println("Nama             : "+nama[i-1]);
			System.out.println("Kode buku        : "+kodeBuku[i-1]);
			System.out.println("Judul buku       : "+judulBuku[i-1]);
			System.out.println("Tanggal pinjam   : "+tglPinjam[i-1]);
			System.out.println("Tanggal kembali  : "+tglKembali[i-1]);
		}
    }
}
