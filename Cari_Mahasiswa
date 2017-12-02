package tubesimpal;

import java.util.Scanner;
/**
 *
 * @author Asvini Dyatmika
 */
public class Cari_Mahasiswa {
    Scanner scan = new Scanner(System.in);
    int data_mhs=scan.nextInt();
    String nim[ ]=new String[data_mhs];
    String nama[ ]=new String[data_mhs];
    String semester[ ]=new String[data_mhs];
    
    public void cari(){
        int cari_nim=0;
        int index[]=new int[data_mhs];
        System.out.println("Cari Data Mahasiswa");
        System.out.print("Masukkan NIM : "); String cari=scan.next();
        
        for(int i=0;i<data_mhs;i++)
            if(nim[i].equals(cari)){
                index[cari_nim]=i;
                cari_nim++;
            }
            if(cari_nim>0){
                System.out.println("Data Mahasiswa : ");
                for(int a=1; a<=cari_nim; a++){
                    int s=index[a-1];                                           
                    System.out.println("=============================================");
                    System.out.println("No. "+(index[a-1]+1)+". Nim : "+nim[s]+"  \n\tNama : "+nama[s]+" \n\tSemester: "+semester[s]+"");
                }
                System.out.println("=============================================\n");
            }
            else{
                System.out.println("Data Mahasiswa "+cari+" yang anda cari tidak ada");
            }
    } 
}
