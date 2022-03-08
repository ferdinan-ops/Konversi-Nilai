import javax.swing.JOptionPane;

public class No1 {
    public static void main(String[] args) {
        String huruf = "";
        String i = JOptionPane.showInputDialog("Masukkan Nilai Anda");
        Float nilai = Float.parseFloat(i);
        System.out.println("");

        if (nilai >= 85 && nilai <= 100) {
            huruf = "A";
        } else if (nilai >= 70 && nilai <= 84) {
            huruf = "B";
        } else if (nilai >= 60 && nilai < 70) {
            huruf = "C";
        } else if (nilai >= 50 && nilai < 60) {
            huruf = "D";
        } else if (nilai < 50) {
            huruf = "E";
        }
        System.out.println("Nilai Anda adalah " + huruf);
    }
}
