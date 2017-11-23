/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.besokbubar.sisteminformasiperpustakaan;

import cucumber.api.PendingException;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import java.util.Scanner;

/**
 *
 * @author ananda
 */
public class InputBukuContext {
 @Dengan("^data buku baru yang akan dimasukkan dan tidak duplikat$")
public void data_buku_baru_yang_akan_dimasukkan_dan_tidak_duplikat() throws Throwable {
    Scanner scan = new Scanner(System.in);
    int data_buku=scan.nextInt();
    String judulbuku [ ]=new String[data_buku];
    String Namapengarang [ ]=new String[data_buku];
    String TahunTerbit [ ]=new String[data_buku];
    //throw new PendingException();
}

@Ketika("^memasukkan data buku$")
public void memasukkan_data_buku() throws Throwable {
    for(int i=1;i<=data_buku;i++){
            System.out.println("Data buku ke -"+i);
            System.out.println("Judul buku = ");
            judulbuku[i-1]=scan.next();
            System.out.println("Nama Pengarang = ");
            Namapengarang[i-1]=scan.next();
            System.out.println("Tahun Terbit = ");
            TahunTerbit[i-1]=scan.next();
            System.out.println("");
            System.out.println("");
        }
    //throw new PendingException();
} 

@Maka("^respon \"([^\"]*)\"$")
public void respon(String arg1) throws Throwable {
        System.out.println("Data Buku");
        System.out.println("");
        for(int i=1;i<=data_buku;i++){
            System.out.println(i+". Judulbuku = "+judulbuku[i-1]+" Nama Pengarang = "+Namapengarang[i-1]+"Tahun terbit = "+TahunTerbit[i-1]);
        }
        System.out.println("");
    //throw new PendingException();
}
}
