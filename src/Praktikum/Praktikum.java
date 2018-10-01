/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Praktikum {
    public static void main(String[] args) {
    int jumlah; 
        try{
    Scanner in = new Scanner (System.in);
    System.out.print("Jumlah yang akan dimasukkan : ");
    jumlah = in.nextInt();
     System.out.println(" hasil " +jumlah);    
     
        }
        catch(Exception e) {
            System.out.println("Nilai yang dimasukkan salah " + "harusnya angka");
        }       
    }
}

