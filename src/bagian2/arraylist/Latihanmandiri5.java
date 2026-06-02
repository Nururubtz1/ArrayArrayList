package bagian2.arraylist;
import java.util.ArrayList;

public class Latihanmandiri5 {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(15);
        angka.add(42);
        angka.add(8);
        angka.add(99);
        angka.add(23);

        int terbesar = angka.get(0);

        for (int i = 0; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }

        System.out.println("Angka: " + angka);
        System.out.println("Nilai Terbesar: " + terbesar);
    }
}