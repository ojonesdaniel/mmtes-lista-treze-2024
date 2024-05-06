import org.junit.Test;
import static org.junit.Assert.*;

public class MediaTest {

    public static double calcularMedia(double numero1, double numero2) {
        return (numero1 + numero2) / 2;
    }

    @Test
    public void testMediaAritmetica() {
        double numero1 = 10;
        double numero2 = 20;
        double resultadoEsperado = 15;
        assertEquals(resultadoEsperado, MediaTest.calcularMedia(numero1, numero2), 0.001);
    }

    @Test
    public void testMediaAritmeticaComNegativos() {
        double numero1 = -5;
        double numero2 = 5;
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, MediaTest.calcularMedia(numero1, numero2), 0.001);
    }

    @Test
    public void testMediaAritmeticaComDecimais() {
        double numero1 = 3.5;
        double numero2 = 6.5;
        double resultadoEsperado = 5; // (3.5 + 6.5) / 2 = 5
        assertEquals(resultadoEsperado, MediaTest.calcularMedia(numero1, numero2), 0.001);
    }
}
