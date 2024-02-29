// 13020220137, M Ilyas Reskiawan In, Kamis, 29 Februari 2024
//Buffering
import java.io.*;
public class Input2 {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama     : ");
        String Nama = input.readLine();
        System.out.print("Masukkan Nim      : ");
        String Nim = input.readLine();
        System.out.print("Masukkan Jurusan  : ");
        String Jurusan = input.readLine();
        System.out.print("Masukkan Fakultas : ");
        String Fakultas = input.readLine();
        System.out.println("\n");
        System.out.println("Nama     : "+ Nama);
        System.out.println("Nim      : "+ Nim);
        System.out.println("Jurusan  : "+ Jurusan);
        System.out.println("Fakultas : "+ Fakultas);

    }
}
