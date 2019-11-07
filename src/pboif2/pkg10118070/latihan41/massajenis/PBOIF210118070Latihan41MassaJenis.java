/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author Ailyasha
 */
public class PBOIF210118070Latihan41MassaJenis {
    
    private static int volume, massaJenis;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Kubus kubus = new Kubus();
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        kubus.setSisi(scanner.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(scanner.nextInt());
        
        volume = kubus.hitungVolume(kubus.getSisi());
        massaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
        
        System.out.println("\n======Hasil Perhitungan======");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + massaJenis);
    }
    
}
