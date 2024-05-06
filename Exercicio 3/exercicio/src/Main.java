import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorProduto;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valorProduto = scan.nextDouble();
        if (valorProduto == 0){
            System.out.println("Encerrando programa...");
        }
        else{
            valorProduto = valorProduto + (valorProduto * 0.1);
            System.out.println("O valor do produto é: R$" + valorProduto);
        }
    }
}