import java.util.Scanner;

class Lanche {

  public static final int PRECO_HAMBURGUER_CARNE = 20;
  public static final int PRECO_HAMBURGUER_FRANGO = 16;
  public static final int PRECO_BATATA = 6;
  public static final int PRECO_REFRIGERANTE = 4;
  
  int quantidade;
  int preco;

  Lanche(int quantidade, String tipo) {
    this.quantidade = quantidade;
    if (tipo.equals("hamburguer de carne")) {
      this.preco = PRECO_HAMBURGUER_CARNE;
    } else if (tipo.equals("hamburguer de frango")) {
      this.preco = PRECO_HAMBURGUER_FRANGO;
    } else if (tipo.equals("batata")) {
      this.preco = PRECO_BATATA;
    } else if (tipo.equals("refrigerante")) {
      this.preco = PRECO_REFRIGERANTE;
    }
  }

  int getPrecoTotal() {
    return this.quantidade * this.preco;
  }
}

public class E3 {


  public static final int PRECO_SALADA = 2;
  public static final int PRECO_MAIONESE = 1;
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numHamburguersCarne = 0;
    int numHamburguersFrango = 0;
    int numBatatas = 0;
    int numRefrigerantes = 0;
    int numSaladas = 0;
    int numMaionese = 0;

    System.out.print("Insira o pedido: ");
    String entrada = scanner.nextLine();
    String[] pedidos = entrada.split(" ");
    for (int i = 0; i < pedidos.length; i++) {
      if (pedidos[i].equals("hamburguer") && pedidos[i+1].equals("de") && pedidos[i+2].equals("carne")) {
        numHamburguersCarne += Integer.parseInt(pedidos[i-1]);
      } else if (pedidos[i].equals("hamburguer") && pedidos[i+1].equals("de") && pedidos[i+2].equals("frango")) {
        numHamburguersFrango += Integer.parseInt(pedidos[i-1]);
      } else if (pedidos[i].equals("batata") || pedidos[i].equals("batatas")) {
        numBatatas += Integer.parseInt(pedidos[i-1]);
      } else if (pedidos[i].equals("refrigerante") || pedidos[i].equals("refrigerantes")) {
        numRefrigerantes += Integer.parseInt(pedidos[i-1]);
      } else if (pedidos[i].equals("salada") && pedidos[i - 1].equals("com")) {
        numSaladas = numHamburguersCarne + numHamburguersFrango;
      } else if (pedidos[i].equals("maionese")) {
        if (numBatatas > 0) {
          numMaionese = numBatatas;
        } else {
          numMaionese = numHamburguersCarne + numHamburguersFrango;
        }
      }
    }

    Lanche hamburguerCarne = new Lanche(numHamburguersCarne, "hamburguer de carne");
    Lanche hamburguerFrango = new Lanche(numHamburguersFrango, "hamburguer de frango");
    Lanche batata = new Lanche(numBatatas, "batata");
    Lanche refrigerante = new Lanche(numRefrigerantes, "refrigerante");

    int valorTotal = 0;

    valorTotal += hamburguerCarne.getPrecoTotal();

    valorTotal += hamburguerFrango.getPrecoTotal();

    valorTotal += batata.getPrecoTotal();

    valorTotal += refrigerante.getPrecoTotal();

    valorTotal += numSaladas * PRECO_SALADA;

    valorTotal += numMaionese * PRECO_MAIONESE;

    System.out.println("Valor total: " + valorTotal);
    System.out.println("Hamburgueres de carne: " + numHamburguersCarne);
    System.out.println("Hamburgueres de frango: " + numHamburguersFrango);
    System.out.println("Batatas: " + numBatatas);
    System.out.println("Refrigerantes: " + numRefrigerantes);
    System.out.println("Saladas: " + numSaladas);
    System.out.println("Maionese: " + numMaionese);
  }
}