/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fgjfgj;
import java.util.Scanner;
/**
 *
 * @author Praktikum
 */
public class Fgjfgj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] bil = new int [100];
        bil[0] = 1;
        bil[1] = 1;
        int deret;
        int jumlah = 0;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan jumlah deret");
        String data = input.nextLine();
        
        deret= Integer.parseInt(data);
        
        for (int i = 0; i < deret; i++) {
            
            bil[i + 2] = bil [i] + bil[i + 1];
            jumlah += bil[i];
            
            
        }
        System.out.println(jumlah+" ");
    }
    
}
