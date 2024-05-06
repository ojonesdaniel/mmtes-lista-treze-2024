import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class FormatadorData {
    public static String formatarData(String data) {
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataFormatada = LocalDate.parse(data, formato);

            if (!data.equals(dataFormatada.format(formato))) {
                return null;
            }

            int dia = dataFormatada.getDayOfMonth();
            int mes = dataFormatada.getMonthValue();
            int ano = dataFormatada.getYear();

            if (dia < 1 || dia > 31) {
                return null;
            }

            if (mes < 1 || mes > 12) {
                return null;
            }

            String mesPorExtenso = dataFormatada.getMonth().getDisplayName(
                    java.time.format.TextStyle.FULL,
                    Locale.getDefault()
            );

            return dia + " de " + mesPorExtenso + " de " + ano;
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}