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

/**
 *
 * @author Bagas Bowo
 */
public class InputBukuContext {
 @Dengan("^data buku baru yang akan dimasukkan dan tidak duplikat$")
public void data_buku_baru_yang_akan_dimasukkan_dan_tidak_duplikat() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Ketika("^memasukkan data buku$")
public void memasukkan_data_buku() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
} 

@Maka("^respon \"([^\"]*)\"$")
public void respon(String arg1) throws Throwable {
  // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}
}
