
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moklet
 */
public class UKLARRAY {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
            System.out.println("Masukkan Nama:");
            String Pilihan = scan.nextLine();
            
            String [][] Nama = {{"Adi","Budi","Lula","Zaza"},{"Bagus","Rudi","Zaki","Putri"}};
            int [][] NISN = {{1234, 5678,1345,5764}, {1124, 1356,2309,7098}};
            String [][] Kelas = {{"XRPL1","XRPL2","XRPL3","XRPL4"},{"XRPL5","XRPL6","XRPL7","XRPL8"}};
                
            
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        
                    
                    if (Nama [i][j]. equalsIgnoreCase (Pilihan)){ 
                        System.out.println("==============");
                        System.out.println("Nama:"+Nama [i][j]);
                        System.out.println("NISN:"+NISN [i][j]);
                        System.out.println("Kelas:"+Kelas [i][j]);
                    break;
                    }}}}
    }
}
