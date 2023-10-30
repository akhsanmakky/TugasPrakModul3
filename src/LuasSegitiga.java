
import java.util.Scanner;
/**
 * Program sederhana untuk menghitung luas segitiga berdasarkan panjang alas dan tinggi.
 */
public class LuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang alas segitiga
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();

        // Meminta pengguna memasukkan tinggi segitiga
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        System.out.println("Luas segitiga adalah: " + luas);

        // Menutup objek Scanner
        input.close();
    }
}
