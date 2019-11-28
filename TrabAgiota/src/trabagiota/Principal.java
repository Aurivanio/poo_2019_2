/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabagiota;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        Agiota agiota = new Agiota(1000);
        agiota.addCliente("flavio", "flavio galvao");
        agiota.emprestar("flavio", 100.0);
        agiota.emprestar("flavio", 100.0);
        agiota.addCliente("chico", "chico biroliro");
        agiota.emprestar("chico", 45.0); 
        agiota.emprestar("chico", 25.0); 
        agiota.matar("chico");
      
       
    }
}

