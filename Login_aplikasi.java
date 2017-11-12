package login;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Bagas Bowo
 */
public class login1 {
    public void login(String username, String password){
        Scanner input = new Scanner(System.in);      
        int nilaii=0;          
            System.out.println("================================");
            System.out.println("      Silahkan LOGIN Dulu       ");
            System.out.println("================================");
            for (int i =0 ; i<= 5 ; i++){
                nilaii=i+1;
                    System.out.print(" Masukan Username : ");
                    username =input.next();
                    System.out.print(" Masukan Password : ");
                    password =input.next();
                    System.out.println("======================================================");
                     if ("Admin".equals(username) &&("Admin".equals(password))){
                    System.out.println(""+ username + ", SELAMAT DATANG DI APLIKASI PERPUSTAKAAN");
                    break;
                    }
                     else{
                        System.out.println("Login Gagal");
                        System.out.println("=============================================================================");
                        System.out.println("Anda dapat melakukan login kembali < 5 kali dan dimulai dari kesempatan ke :"+nilaii);
                        System.out.println("=============================================================================");
                     }
                if (nilaii >=6){
                    System.out.println("Anda Tidak Berhak Login karena telah Salah menginput data sebanyak "+i);
                }      
            }
    }
} 
