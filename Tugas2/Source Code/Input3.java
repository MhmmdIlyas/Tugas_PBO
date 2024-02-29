// 13020220137, M Ilyas Reskiawan In, Kamis, 29 Februari 2024
//Javax Swing
import javax.swing.*;
public class Input3 {
    public static void main(String[] args) {
        String Nama = JOptionPane.showInputDialog("Masukkan Nama     : ");
        String Nim = JOptionPane.showInputDialog("Masukkan Nim      : ");
        String Jurusan = JOptionPane.showInputDialog("Masukkan Jurusan  : ");
        String Fakultas = JOptionPane.showInputDialog("Masukkan Fakultas : ");
        System.out.println("\n");
        System.out.println("Nama     : " + Nama);
        System.out.println("Nim      : " + Nim);
        System.out.println("Jurusan  : " + Jurusan);
        System.out.println("Fakultas : " + Fakultas);
    }
}
