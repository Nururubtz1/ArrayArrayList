package bagian1.array;

public class Latihanmandiri1 {
    public static void main(String[] args) {
        double[] suhu = new double[6];
        suhu[0] = 28.5;
        suhu[1] = 30.2;
        suhu[2] = 27.8;
        suhu[3] = 31.5; // Ini yang tertinggi
        suhu[4] = 29.1;
        suhu[5] = 26.5; // Ini yang terendah

        System.out.println("Suhu Tertinggi : " + suhu[3]);
        System.out.println("Suhu Terendah  : " + suhu[5]);
    } 
}