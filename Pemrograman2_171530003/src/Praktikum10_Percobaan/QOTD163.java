/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10_Percobaan;

/**
 *
 * @author kindi
 */
class A{
    private final void Bergerak(){
        System.out.println("Animasi Berjalan");
    }
}
public class QOTD163 extends A{
    public final void Bergerak(){
        System.out.println("Bergerak");
    }
    
    public static void main(String arg[]){
        new QOTD163().Bergerak();
    }
}

/**
 * 
 * output
 * Bergerak
 * 
 * karena pada baris ke-23 mendeklarasikan object QOTD163 dengan method Bergerak yang ada didalam class QOTD163
 */
