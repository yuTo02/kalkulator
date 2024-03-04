import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // inisialisasi objek Scanner untuk membuat user berinteraksi dalam
                                                // memasukan angka
        // deklarasi program kalkulator
        System.out.println("==========KALKULATOR SEDERHANA==========");
        System.out.printf("masukan angka : "); // mencetak perintah, agar user memasukan angka yang pertama
        double angka1 = input.nextDouble(); // inisialisasi tipe data double untuk menyimpan hasil scanner
        System.out.printf("masukan angka : "); // mencetak perintah, agar user memasukan angka yang kedua
        double angka2 = input.nextDouble(); // inisialisasi tipe data double untuk menyimpan hasil scanner

        // deklarasi pilihan kalkulator
        System.out.println("pilih operasi kalkulator");
        System.out.println("1. penjumlahan ");
        System.out.println("2. pengurangan ");
        System.out.println("3. perkalian ");
        System.out.println("4. pembagian ");
        System.out.printf("masukan pilihan (1/2/3/4): ");
        int pilih = input.nextInt(); // inisialisasi tipe data int untuk menyimpan hasil scanner

    }
}
