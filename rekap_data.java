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

public class rekap_data {
    Scanner add = new Scanner(System.in);
    int rekap_data=add.nextInt();
	String noPinjam[] = new String[rekap_data];
        String kdAnggota[] = new String[rekap_data];
	String nama[] = new String[rekap_data];
	String judulBuku[] = new String[rekap_data];
	String kodeBuku[] = new String[data_kembali];
	String tglKembali[] = new String[data_kembali];
	String tglPinjam[] = new String[data_kembali];
	
    public void showRekap(){
        System.out.println("==========================");
        System.out.println("      Rekap Data 	      ");
        System.out.println("==========================");
        System.out.println("");
        for(int i = 1; i<=rekap_data; i++) {
            System.out.println("Nomor peminjaman : ");
            noPinjam[i-1] = add.next();			
            System.out.println("Kode Anggota : ");
            kdAnggota[i-1] = add.next();
			if (array_rekap[kdAnggota] == data_kembali[kdAnggota])
				System.out.println("Data ditemukan");
				System.out.println("Nama	         : "+rekap_data.nama[i-1]);
				System.out.println("Kode buku        : "+rekap_data.kodeBuku[i-1]);
				if (array_rekap[kdAnggota] == data_kembali[kdAnggota])
					System.out.println("Data ditemukan");
					System.out.println("Judul buku   : "+rekap_data.judulBuku[i-1])
				System.out.println("Tanggal pinjam   : "+rekap_data.tglPinjam[i-1]);
				System.out.println("Tanggal kembali  : "+rekap_data.tglKembali[i-1]);
		}
	}
}
