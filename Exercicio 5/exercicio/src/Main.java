public class Main {
    public static void main(String[] args) {

        String data = "25/12/2024";
        String dataFormatada = FormatadorData.formatarData(data);
        if (dataFormatada != null) {
            System.out.println("Data formatada: " + dataFormatada);
        } else {
            System.out.println("Data inválida!");
        }
    }
}