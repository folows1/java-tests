import java.util.Scanner; 

public class E5 {

  public static void printGolombSequence(int n) {
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = i - 1; j > 0; j -= a) {
                a++;
            }
            System.out.print(a + " ");
        }
        System.out.println();
    }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Insira o número de termos da sequência de Golomb: ");
    int n = scanner.nextInt();
    scanner.close();
    printGolombSequence(n);
  }
}