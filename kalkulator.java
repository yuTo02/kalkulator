import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Inisialisasi objek Scanner untuk input

        // Deklarasi program kalkulator
        System.out.println("========== KALKULATOR SEDERHANA ==========");
        System.out.print("Masukkan angka pertama: "); // Meminta input angka pertama dari pengguna
        double angka1 = input.nextDouble(); // Membaca angka pertama dari pengguna
        System.out.print("Masukkan angka kedua: "); // Meminta input angka kedua dari pengguna
        double angka2 = input.nextDouble(); // Membaca angka kedua dari pengguna

        // Deklarasi pilihan operasi kalkulator
        System.out.println("Pilih operasi kalkulator:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilih = input.nextInt(); // Membaca pilihan operasi dari pengguna

        double hasil = 0; // Variabel untuk menyimpan hasil operasi

        // Switch case untuk melakukan operasi berdasarkan pilihan
        switch (pilih) {
            case 1:
                hasil = penjumlahan(angka1, angka2);
                break;
            case 2:
                hasil = pengurangan(angka1, angka2);
                break;
            case 3:
                hasil = perkalian(angka1, angka2);
                break;
            case 4:
                hasil = pembagian(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        // Menampilkan hasil operasi
        System.out.printf("Hasil operasi = %.0f\n ", hasil);

        input.close(); // Menutup objek Scanner setelah selesai
    }

    // Method untuk operasi penjumlahan
    public static double penjumlahan(double x, double y) {
        return x + y;
    }

    // Method untuk operasi pengurangan
    public static double pengurangan(double x, double y) {
        return x - y;
    }

    // Method untuk operasi perkalian
    public static double perkalian(double x, double y) {
        return x * y;
    }

    // Method untuk operasi pembagian
    public static double pembagian(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: Pembagian dengan angka nol tidak dapat dilakukan.");
            return 0;
        }
    }
}
