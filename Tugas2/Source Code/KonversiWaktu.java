// 13020220137, M Ilyas Reskiawan In, Kamis, 29 Februari 2024
//Konversi Waktu
import java.util.Scanner;
public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Detik : ");
        long totalDetik = input.nextLong();
        long detikSekarang = totalDetik % 60;
        long totalMenit = totalDetik / 60;
        long menitSekarang = totalMenit % 60;
        long totalJam = totalMenit / 60;
        long jamSekarang = totalJam % 24;

        System.out.println("Tampil Waktu : "+ jamSekarang+ ":"+ menitSekarang +":"+ detikSekarang);
    }
}