/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author AIRGG
 */
public class Testing {
    
    public static void main(String[] args) {
        Integer orang = 5;
        Kereta kereta = new Kereta(orang);
        // express
        kereta.hitung(1, true);
        // ekonomi
        kereta.hitung(2, true);
        
        // beda orang
        orang = 7;
        kereta = new Kereta(orang);
        kereta.hitung(1, true);
        
        orang = 9;
        kereta = new Kereta(orang);
        kereta.hitung(2, true);

	System.out.println("Humam")
    }
}
