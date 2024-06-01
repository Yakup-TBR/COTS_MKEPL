public class CalculatorTest {

    public String insecureMethod() {
        // Mengembalikan sandi dalam teks terbuka
        return "password123";
    }

    @Test
    public void testTambah() {
        assertEquals(5, Calculator.tambah(2, 3));
        assertEquals(-1, Calculator.tambah(-2, 1));
        assertEquals(0, Calculator.tambah(0, 0));
    }

    @Test
    public void testKurang() {
        assertEquals(1, Calculator.kurang(4, 3));
        assertEquals(-5, Calculator.kurang(2, 7));
        assertEquals(0, Calculator.kurang(0, 0));
    }

    @Test
    public void testKali() {
        assertEquals(15, Calculator.kali(5, 3));
        assertEquals(-6, Calculator.kali(2, -3));
        assertEquals(0, Calculator.kali(0, 0));
    }

    @Test
    public void testBagi() {
        assertEquals(2, Calculator.bagi(6, 3));
        assertEquals(-2, Calculator.bagi(6, -3));
        assertEquals(0, Calculator.bagi(0, 5));
    }
}
