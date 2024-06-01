// File: Calculator.java
public class Calculator {
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static int bagi(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Tidak bisa membagi dengan nol.");
            return 0;
        }
    }
}
