/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Asus
 */
public class MultipleCatch {
    public static void main(String[] args) {
        try
        {
            int a = 3/0;
            int num = Integer.parseInt(args[0]);
            System.out.println("Perintah selanjutnya. .");
        }
        catch(ArrayIndexOutOfBoundsException e){
        }
        catch(NullPointerException e){
        }
        catch(Exception e){
            System.out.println("Angka Nol");
            
        }
    }
}
