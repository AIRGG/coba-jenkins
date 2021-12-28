/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.util.Scanner;

/**
 *
 * @author AIRGG
 */
public class Tiket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("HAI");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Orang: ");
        int orang = scan.nextInt();
        System.out.println("-- Pilih Kendaraan --");
        System.out.println("1. Kereta");
        int inp = scan.nextInt();
        switch(inp){
            case 1: 
                System.out.println("--> Kendaraan Kereta");
                Kereta kereta = new Kereta(orang);
                kereta.hitung();
                break;
        }
    }
    
}
