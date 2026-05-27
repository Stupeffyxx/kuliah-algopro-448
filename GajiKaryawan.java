import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Array gaji berdasarkan golongan
        int[] gaji = {5000000, 6500000, 9500000}; // A=0, B=1, C=2
        
        // Array persen lembur (dalam bentuk desimal)
        double[] persenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        System.out.print("Masukkan Golongan (A/B/C): ");
        String gol = input.nextLine().trim().toUpperCase();

        System.out.print("Masukkan jumlah jam lembur: ");
        int jam = input.nextInt();

        // Validasi golongan
        int indexGolongan;
        switch (gol) {
            case "A" -> indexGolongan = 0;
            case "B" -> indexGolongan = 1;
            case "C" -> indexGolongan = 2;
            default -> {
                System.out.println("Golongan tidak valid!");
                input.close();
                return;
            }
        }

        // Hitung gaji pokok
        double gajiPokok = gaji[indexGolongan];

        // Hitung gaji lembur
        double gajiLembur = gajiPokok * persenLembur[jam > 4 ? 4 : jam] * jam; 
        // Note: menggunakan index max 4 jika jam > 4

        // Total gaji
        double totalGaji = gajiPokok + gajiLembur;

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Golongan       : " + gol);
        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
        System.out.println("Jam Lembur     : " + jam + " jam");
        System.out.println("Gaji Lembur    : Rp " + gajiLembur);
        System.out.println("Total Gaji     : Rp " + totalGaji);

        input.close();
    }
}