/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesimpal;
import cucumber.api.PendingException;
import cucumber.api.java.bm.Maka;
import cucumber.api.java.id.Dengan;
import cucumber.api.java.id.Ketika;
import java.util.Scanner;
/**
 *
 * @author Asvini Dyatmika
 */
public class PengembalianContext {
 @Ketika("^Memasukkan data pengembalian$")
public void memasukkan_data_pengembalian() throws Throwable {   
    Scanner add = new Scanner(System.in);
    int data_kembali=add.nextInt();
    String kdAnggota[] = new String[data_kembali];
    String kodeBuku[] = new String[data_kembali];
    String tglKembali[] = new String[data_kembali];
    String tglPinjam[] = new String[data_kembali];
    for(int i = 1; i<=data_kembali; i++) {
            System.out.println("Kode Anggota : ");
            kdAnggota[i-1] = add.next();
            if (array_rekap[kdAnggota] == data_kembali[kdAnggota])
		boolean result = true;				
            else
		boolean result = false;}
}
@Maka("^respon \"([^\"]*)\"$")
public void respon(String arg1) throws Throwable {
    boolean result;
    if (result = true){
        System.out.println("Data Ditemukan");
    }else{
        System.out.println("Data Tidak Ditemukan");
    }
}
