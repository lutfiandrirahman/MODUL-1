/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul.pkg1.a.pkg202357201053;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Modul1A202357201053 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        
        //a
        System.out.println("Array Awal : ");
        for (int a = 0; a < data.length; a++) {
            double ratarata = 0.0;
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");

                ratarata += data[a][b];

            }
            ratarata /= data[a].length;
            System.out.println("\nrata rata array = " + ratarata);
        }
        
        //b
        int nilaiDicari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari:"));
        boolean ditemukan = false;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                if (data[a][b] == nilaiDicari) {
                    ditemukan = true;
                    JOptionPane.showMessageDialog(null, "Nilai" + nilaiDicari + " ditemukan pada indeks [" + a + "][" + b + "].");
                    int nilaiBaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru"));
                    data[a][b] = nilaiBaru;
                }
            }
        }
        if (!ditemukan) {
            JOptionPane.showMessageDialog(null, "Nilai " + nilaiDicari + " tidak di temukan dalam array.");
            System.out.println("\nArray Tidak Ada Perubahan, karena nilai array yang dicari tidak ada");
        }else {
            System.out.println("\nArray Setelah Perubahan:");
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[a].length; b++) {
                    System.out.print(data[a][b] + " ");
                }
                System.out.println();
            }
        }
        
        //c
        int totalKolom = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                if (b % 2 != 0) {
                    totalKolom += data[a][b];
                }
            }
        }
        System.out.println("Total elemen dengan indeks kolom ganjil : " + totalKolom);
    }

}
    


    
