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
 * @author Bagas Bowo
 */
public class LoginContext {
 @Ketika("^Memasukkan data login$")
public void memasukkan_data_login() throws Throwable {
    String username;
    String password;
    Scanner input = new Scanner(System.in);
                    System.out.print(" Masukan Username : ");
                    username =input.next();
                    System.out.print(" Masukan Password : ");
                    password =input.next();
                    if ("Admin".equals(username) &&("Admin".equals(password))){
                        boolean result = true;
                    }else{
                        boolean result = false;}
    //throw new PendingException();
}

@Maka("^respon \"([^\"]*)\"$")
public void respon(String arg1) throws Throwable {
    boolean result;
    if (result = true){
        System.out.println("Login berhasil");
    }else{
        System.out.println("Login gagal");
    }
    //throw new PendingException();
}
}
