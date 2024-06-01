// File: TesUAS.java
import java.util.Scanner;

public class TesUAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan Anda (1-4): ");
        int pilihan = scanner.nextInt();

        int hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = Calculator.tambah(angka1, angka2);
                break;
            case 2:
                hasil = Calculator.kurang(angka1, angka2);
                break;
            case 3:
                hasil = Calculator.kali(angka1, angka2);
                break;
            case 4:
                hasil = Calculator.bagi(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("Hasil: " + hasil);
    }
}
