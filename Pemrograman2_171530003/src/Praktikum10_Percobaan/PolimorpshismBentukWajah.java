
package Praktikum10_Percobaan;


public class PolimorpshismBentukWajah {
    /**Main Method*/
    
    public static void main(String args[]){
        System.out.println("-----Program Polimorphism------");
        System.out.println("===============================");
        
        //membuat objek-objek raut wajah
        
        BentukWajah bentuk = new BentukWajah();
        Senyum senyum = new Senyum();
        Tertawa tertawa = new Tertawa();
        Marah marah = new Marah();
        Sedih sedih = new Sedih();
        
        //polimorphism dari bentuk wajah ada 5 dari 0-4
        
        BentukWajah [] Bentuk = new BentukWajah[5];
        Bentuk[0] = bentuk;
        Bentuk[1] = senyum;
        Bentuk[2] = tertawa;
        Bentuk[3] = marah;
        Bentuk[4] = sedih;
        
        System.out.println("Bentuk[0] : "+Bentuk[0].respons());
        System.out.println("Bentuk[1] : "+Bentuk[1].respons());
        System.out.println("Bentuk[2] : "+Bentuk[2].respons());
        System.out.println("Bentuk[3] : "+Bentuk[3].respons());
        System.out.println("Bentuk[4] : "+Bentuk[4].respons());
        
    }
}
