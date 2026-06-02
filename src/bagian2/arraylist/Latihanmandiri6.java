package bagian2.arraylist;
import java.util.ArrayList;

public class Latihanmandiri6 {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Ahmad");
        daftarNama.add("Citra");
        daftarNama.add("Arif");
        daftarNama.add("Dedi");

        System.out.println("Daftar semua nama: " + daftarNama);
        System.out.println("Nama yang diawali huruf 'A':");

        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}