import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    // Zadanie 1
    @Test
    public void testSumyDwochLiczbDodatnich() {
        assertThat(Calculator.add_numbers(3, 10)).isEqualTo(13);
    }

    @Test
    public void testSumaDodatniejIUjemnej() {
        assertThat(Calculator.add_numbers(5, -3)).isEqualTo(2);
    }

    @Test
    public void testSumaDwochUjemnych() {
        assertThat(Calculator.add_numbers(-5, -7)).isEqualTo(-12);
    }

    @Test
    public void testSumaZerem() {
        assertThat(Calculator.add_numbers(0, 9)).isEqualTo(9);
    }

    // Zadanie 2
    @Test
    public void testParzystej() {
        assertThat(Calculator.is_even(10)).isTrue();
        assertThat(Calculator.is_even(0)).isTrue();
    }

    @Test
    public void testNieparzystej() {
        assertThat(Calculator.is_even(3)).isFalse();
        assertThat(Calculator.is_even(-1)).isFalse();
    }

    @Test
    public void testDuzejLiczbyParzystej() {
        assertThat(Calculator.is_even(1000000)).isTrue();
    }

    // Zadanie 3
    @Test
    public void testKonwersjiStandardowychTemperatur() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
        assertThat(Calculator.celsius_to_fahrenheit(100)).isEqualTo(212.0);
    }

    @Test
    public void testKonwersjiUjemnej() {
        assertThat(Calculator.celsius_to_fahrenheit(-10)).isEqualTo(14.0);
    }

    @Test
    public void testKonwersjiDuzej() {
        assertThat(Calculator.celsius_to_fahrenheit(1000)).isEqualTo(1832.0);
    }

    // Zadanie 4
    @Test
    public void testSilniaMalychLiczb() {
        assertThat(Calculator.factorial(0)).isEqualTo(1);
        assertThat(Calculator.factorial(1)).isEqualTo(1);
        assertThat(Calculator.factorial(2)).isEqualTo(2);
    }

    @Test
    public void testSilniaDuzychLiczb() {
        assertThat(Calculator.factorial(5)).isEqualTo(120);
        assertThat(Calculator.factorial(10)).isEqualTo(3628800);
    }

    @Test
    public void testSilniaZLiczbyUjemnej() {
        assertThatThrownBy(() -> Calculator.factorial(-3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Negative numbers not allowed");
    }

    // Zadanie 5
    @Test
    public void testLiczbPierwszych() {
        assertThat(Calculator.is_prime(2)).isTrue();
        assertThat(Calculator.is_prime(3)).isTrue();
        assertThat(Calculator.is_prime(7)).isTrue();
    }

    @Test
    public void testLiczbNiepierwszych() {
        assertThat(Calculator.is_prime(1)).isFalse();
        assertThat(Calculator.is_prime(4)).isFalse();
        assertThat(Calculator.is_prime(9)).isFalse();
    }

    @Test
    public void testDuzejLiczbyPierwszej() {
        assertThat(Calculator.is_prime(7919)).isTrue();
    }
}
