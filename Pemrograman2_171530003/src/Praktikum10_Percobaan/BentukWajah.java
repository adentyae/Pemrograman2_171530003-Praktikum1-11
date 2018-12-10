
package Praktikum10_Percobaan;


public class BentukWajah {
    /*Membuat sebuah method respons pada class induk dimana mengembalikan sebuah nilai String*/
    
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
    
}

class Senyum extends BentukWajah{
    public String respons(){
        return ("Senyum karena senang");
    }
}

class Tertawa extends BentukWajah{
    public String respons(){
        return ("Tertawa karena gembira");
    }
}

class Marah extends BentukWajah{
    public String respons(){
        return ("Kemarahan disebabkan bertengkar");
    }
}

class Sedih extends BentukWajah{
    public String respons(){
        return ("Sedih disebabkan cemburu");
    }
}



    
