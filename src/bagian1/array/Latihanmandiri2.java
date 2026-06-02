package bagian1.array;

public class Latihanmandiri2 {
    public static void main(String[] args) {
        String[] hari = new String[5];
        hari[0] = "Senin";   
        hari[1] = "Selasa";  
        hari[2] = "Rabu";    
        hari[3] = "Kamis";   
        hari[4] = "Minggu";  

        System.out.println("=== Hari dengan lebih dari 5 huruf ===");
        System.out.println("Hari ke-2: " + hari[1] + " (" + hari[1].length() + " huruf)");
        System.out.println("Hari ke-5: " + hari[4] + " (" + hari[4].length() + " huruf)");
    } 
}