
package bagian1.array;

public class Latihanmandiri3 {
    public static void main(String[] args) {
        int[] angka = {4, 8, 15, 16, 23, 42};

        System.out.println("=== Isi Array ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + " = " + angka[i]);
        }

        int jumlahGenap = 4; 

        System.out.println("\n=== Hasil Manual ===");
        System.out.println("Angka genap yang ditemukan: " + angka[0] + ", " + angka[1] + ", " + angka[3] + ", " + angka[5]);
        System.out.println("Total angka genap: " + jumlahGenap);
    }
}  
