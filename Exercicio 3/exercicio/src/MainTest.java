import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    public static double calcularValorProduto(double valorProduto) {
        return valorProduto * 1.1;
    }

    @Test
    public void testValorProdutoComAcrescimo() {
        double valorProduto = 50.00;
        double resultadoEsperado = 55.00;
        assertEquals(resultadoEsperado, MainTest.calcularValorProduto(valorProduto), 0.01);
    }

    @Test
    public void testEncerrarPrograma() {
        double valorProduto = 0;
        double resultadoEsperado = 0;
        assertEquals(resultadoEsperado, MainTest.calcularValorProduto(valorProduto), 0.01);
    }
}
