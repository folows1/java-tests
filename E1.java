import java.util.Scanner;

public class E1 {
  public static void main(String[] args) {

    final double TAXA_CONVERSAO = 5.36;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira o valor em dólares: ");
    double valorDolares = scanner.nextDouble();

    double valorReais = valorDolares * TAXA_CONVERSAO;

    System.out.printf("O valor em reais é: R$%.2f", valorReais);
  }
}