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
class Animal{
    
}

class Mammal extends Animal{
    
}

class Cat extends Animal{
    
}
public class Dolphin extends Mammal {
    public static void main(String[] args){
        Mammal m = new Cat();
        Animal a = m;
        Dolphin d = (Dolphin) a;
    }
}

/**
 * error pendeklarasian object pada baris ke-25 
 */
