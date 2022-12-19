
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            boolean c = false;
            while (!c) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Digite o palindrome inicial(fim para terminar): ");
                String s = br.readLine();
                if (s.length() < 100) {
                    if (s.equals("fim")) {
                        c = true;
                    } else {
                        System.out.println("Maior palíndrome é: " + a(s));
                    }
                } else {
                    System.out.print("A cadeia de caracteres precisa ter no máximo 100 elementos");
                }
            }
        } catch (Exception e) {

        }
    }

    public static String a(String s) {
        String maiorPalindromo = "";
        int e = s.length();
        for (int i = 0; i < e; i++) {
            for (int z = i + 1; z <= e; z++) {
                String p = s.substring(i, z);
                if (isPalindrome(p) && p.length() > maiorPalindromo.length()) {
                    maiorPalindromo = p;
                }
            }
        }
        if (maiorPalindromo.length() <= 1) {
            return "Não há palíndromos";
        }

        return maiorPalindromo;
    }


    public static boolean isPalindrome(String word) {
        int l = word.length();
        for (int i = 0; i < l / 2; i++) {
            if (word.charAt(i) != word.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }
}