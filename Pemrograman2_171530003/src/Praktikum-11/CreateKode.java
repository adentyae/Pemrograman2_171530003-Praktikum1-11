import javax.swing.JOptionPane;


public class CreateKode{

    String tahun_ajaran = "2017-2018";
    String semester = "";
    String kd_prodi = "153";
    String kode = "";

    public void set_kode(){
        while(true){
            semester = JOptionPane.showInputDialog("Masukkan Semester : ");
            if(semester.equals("Gasal")){
                kode = JOptionPane.showInputDialog("Masukkan Kode : ");
                String smt = semester.replace("Gasal", "1");
                String nim = tahun_ajaran.substring(2, 4) + tahun_ajaran.substring(7, 9) + smt + kd_prodi + kode;
                System.out.println("Kode : " + nim);
                break;
            }else if(semester.equals("Genap")){
                kode = JOptionPane.showInputDialog("Masukkan Kode : ");
                String smt = semester.replace("Genap", "2");
                String nim = tahun_ajaran.substring(2, 4) + tahun_ajaran.substring(7, 9) + smt + kd_prodi + kode;
                System.out.println("Kode : " + nim);
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Silahkan Masukkan Semester Gasal / Genap");
            }
        }
    }
    public static void main(String[] args) {
        CreateKode setkd = new CreateKode();
        setkd.set_kode();
    }

}
