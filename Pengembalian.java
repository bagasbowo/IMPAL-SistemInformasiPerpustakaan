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

public class pengembalian {
    Scanner add = new Scanner(System.in);
    int data_kembali=add.nextInt();
    String kdAnggota[] = new String[data_kembali];
	String kodeBuku[] = new String[data_kembali];
	String tglKembali[] = new String[data_kembali];
	String tglPinjam[] = new String[data_kembali];
	
    public void addKembali(){
        System.out.println("==========================");
        System.out.println("     Lihat Pengembalian   ");
        System.out.println("==========================");
        System.out.println("");
        for(int i = 1; i<=data_kembali; i++) {
            System.out.println("Kode Anggota : ");
            kdAnggota[i-1] = add.next();
			if (array_rekap[kdAnggota] == data_kembali[kdAnggota])
				System.out.println("Data ditemukan");
				System.out.println("Kode buku        : "+data_kembali.kodeBuku[i-1]);
				System.out.println("Judul buku       : "+data_kembali.judulBuku[i-1]);
				System.out.println("Tanggal pinjam   : "+data_kembali.tglPinjam[i-1]);
				System.out.println("Tanggal kembali  : "+data_kembali.tglKembali[i-1]);
			else
				System.out.println("Data tidak ditemukan");
		}
	}
}
