
package Praktikum10_Percobaan;


final class Bbb {
    int xxx;
    void yyy(){
        xxx = 1;
    }
}

class Bbb extends Bbb{
    final Bbb finalref = new Bbb();
    
    final void yyy(){
        System.out.println("Method yyy");
        finalref.xxx = 12345;
    }
}

/**
 * 
 * pada modifier final harus diganti public agar tidak terjadi error
 */