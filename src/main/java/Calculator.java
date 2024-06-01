// File: Calculator.java
public class Calculator {
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Duplicate line 1
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Duplicate line 2
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Duplicate line 3
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Duplicate line 4
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Duplicate line 5
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
