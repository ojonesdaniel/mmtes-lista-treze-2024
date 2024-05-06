import static org.junit.Assert.*;
import org.junit.Test;

public class FormatadorDataTest {

    @Test
    public void testFormatarDataValida() {
        String dataEntrada = "25/12/2023";
        String resultadoEsperado = "25 de dezembro de 2023";
        assertEquals(resultadoEsperado, FormatadorData.formatarData(dataEntrada));
    }

    @Test
    public void testFormatarDataInvalida() {
        String dataEntrada = "32/12/2023";
        assertNull(FormatadorData.formatarData(dataEntrada));
    }

    @Test
    public void testFormatarDataInvalidaMesNegativo() {
        String dataEntrada = "25/-1/2023";
        assertNull(FormatadorData.formatarData(dataEntrada));
    }

    @Test
    public void testFormatarDataInvalidaAnoNegativo() {
        String dataEntrada = "25/12/-2023";
        assertNull(FormatadorData.formatarData(dataEntrada));
    }

    @Test
    public void testFormatarDataInvalidaFormatoInvalido() {
        String dataEntrada = "25-12-2023";
        assertNull(FormatadorData.formatarData(dataEntrada));
    }
}
