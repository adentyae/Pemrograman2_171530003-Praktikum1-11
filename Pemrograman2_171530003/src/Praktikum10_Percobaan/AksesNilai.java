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
class QOTD162 {
    public int x = 5;
}

class child extends QOTD162{
    public int x = 10;
    
    public void info(int x){
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

public class AksesNilai{
    public static void main(String [] arg){
        child c = new child();
        c.info(15);
    }
}

/**
 * output 
 * 15
 * 10
 * 5
 * 
 * karena 
 * nilai x pada baris ke-20 merujuk pada nilai yang diberikan pada baris 29
 * nilai x pada baris ke-21 merujuk pada nilai yang diberikan pada baris 17
 * nilai x pada baris ke-22 merujuk pada nilai yang diberikan parent pada baris 13
 * 
 */
