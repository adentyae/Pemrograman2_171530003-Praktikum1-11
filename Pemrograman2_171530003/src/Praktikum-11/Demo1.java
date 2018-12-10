import sun.launcher.resources.launcher;

public class Demo1{
    public static void main(String[] args) {
        String s = "Pemrograman Java";
        String HurufKapital = s.toUpperCase();
        String HurufKecil = s.toLowerCase();

        int IndexAwal = 12;
        int IndexAkhir = 16;
        char[] Karakter = new char[IndexAkhir-IndexAwal];
        s.getChars(IndexAwal, IndexAkhir, Karakter, 0);

        byte[] temp = new byte[s.length()];
        temp = s.getBytes();

        String Trim = s.trim();
        String Sub = s.substring(5, 9);
        String Replace1 = s.replace("Pemrograman", "Program");
        String Replace2 = "Java".replace('v', 'w');

        System.out.println("Penggunaan method toUpperCase()\t: "+ HurufKapital);
        System.out.println("Penggunaan method toLowerCase()\t: "+ HurufKecil);
        System.out.println("Penggunaan method charAt()\t: "+ s.charAt(0));
        System.out.println("Penggunaan method getChars()\t: "+ Karakter[0]);
        System.out.println("Penggunaan method getBytes()\t: "+ temp[0]);
        System.out.println("Penggunaan method trim()\t: "+ Trim);
        System.out.println("Penggunaan method substring()\t: "+ Sub);
        System.out.println("Penggunaan method replace()\t: "+ Replace1 + " " + Replace2);


    }
}