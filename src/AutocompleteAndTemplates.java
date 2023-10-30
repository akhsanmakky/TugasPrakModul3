import com.sun.tools.javac.Main;

import java.util.Scanner ;

public class AutocompleteAndTemplates {
    /**
     * class
     * class autocompleteandtemplates
     */
    public String nama;
    public int tanggallahir;
    public int bulanlahir;
    public int tahunlahir;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama : ");
        nama = scanner.nextLine();
        System.out.print("Masukan Tanggal Lahir : ");
        tanggallahir = scanner.nextInt();
        System.out.print("Masukan Bulan Lahir : ");
        bulanlahir = scanner.nextInt();
        System.out.print("Masukan Tahun Lahir : ");
        tahunlahir = scanner.nextInt();
    }
}