import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for the Calculator.
 * Contains various unit tests for Calculator methods.
 * 
 * Author: Yakup Asmaidy
 */
public class CalculatorTest {

    // Introducing a high-severity issue by using a system property insecurely
    public String insecureMethod() {
        // This method uses a system property in a way that can be insecure
        return System.getProperty("user.home");
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

    @Test
    public void testDivideByZero() {
        // Test divide by zero
        assertThrows(ArithmeticException.class, () -> Calculator.bagi(5, 0));
    }

    @Test
    public void testLongMethod() {
        // Introduce a long method to trigger SonarCloud's code smell detection
        // This method is intentionally long to exceed recommended length
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        assertEquals(499500, sum);
    }

    @Test
    public void testUnhandledException() {
        // Introduce an unhandled exception to trigger SonarCloud's exception handling detection
        int[] arr = new int[5];
        arr[10] = 10; // ArrayIndexOutOfBoundsException will be thrown
    }
    
    @Test
    public void testDuplicateLines() {
        // Introduce more than 5 duplicate lines
        int x = 0;
        x++;
        x++;
        x++;
        x++;
        x++;
        x++; // 6th duplicated line
    }

}
