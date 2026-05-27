import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Golongan (A/B/C): ");
        String golongan = input.nextLine().trim().toUpperCase();

        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        input.close();

        // Gaji pokok berdasarkan golongan
        double gajiPokok = 0;
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        // Persen lembur berdasarkan jam
        double persenLembur = 0;
        if (jamLembur == 1) {
            persenLembur = 0.30;
        } else if (jamLembur == 2) {
            persenLembur = 0.32;
        } else if (jamLembur == 3) {
            persenLembur = 0.34;
        } else if (jamLembur == 4) {
            persenLembur = 0.36;
        } else if (jamLembur >= 5) {
            persenLembur = 0.38;
        }

        // Hitung gaji
        double gajiLembur = gajiPokok * persenLembur;
        double totalGaji = gajiPokok + gajiLembur;

        // Output
        System.out.println("Golongan Karyawan : " + golongan);
        System.out.println("Gaji Pokok        : Rp." + gajiPokok);
        System.out.println("Jam Lembur        : " + jamLembur + " Jam");
        System.out.println("Gaji Lembur       : Rp." + gajiLembur);
        System.out.println("Total Penghasilan : Rp." + totalGaji);
    }
}