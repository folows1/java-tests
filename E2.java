import java.util.Scanner; 

public class E2 {
  public static void main(String[] args) {
    int[] contagemNumeros = new int[10];

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira a sequência de números: ");
    String sequencia = scanner.nextLine();

    for (int i = 0; i < sequencia.length(); i++) {
      int numero = Character.getNumericValue(sequencia.charAt(i));
      contagemNumeros[numero]++;
    }

    int numeroMaisFrequente = -1;
    int contagemMaxima = -1;

    for (int i = 0; i < contagemNumeros.length; i++) {
      if (contagemNumeros[i] > contagemMaxima) {
        numeroMaisFrequente = i;
        contagemMaxima = contagemNumeros[i];
      }
    }

    for (int i = sequencia.length() - 1; i >= 0; i--) {
      int numero = Character.getNumericValue(sequencia.charAt(i));
      if (contagemNumeros[numero] == contagemMaxima) {
        numeroMaisFrequente = numero;
        break;
      }
    }

    System.out.println("O número mais frequente é: " + numeroMaisFrequente);
  }
}