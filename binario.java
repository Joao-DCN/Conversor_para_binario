import java.util.Scanner;

public class binario {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // conversor de números naturais para binário

    // logo
    System.out.println("+********************************+");
    System.out.println("*     conversor para binario     *");
    System.out.println("+********************************+");
    System.out.print("numero natural: ");

    // numero dado pelo usuário
    int numero_escolhido = teclado.nextInt();

    // numero de comparação
    int comparador = 1;

    // contador de divisão e tamanho da forma
    int contador = 1;

    // determinador de número de comparação
    while (numero_escolhido > comparador) {
      contador++;
      comparador = comparador * 2;
    }

    // forma de binário
    int V[] = new int[contador];

    int permissao = 0;

    // se o número for igual a 0
    if (numero_escolhido == 0) {
      System.out.print("equivalente em binario: ");
      System.out.print(numero_escolhido);
    }

    // se o número for maior que 0
    else {

      System.out.print("equivalente em binario: ");

      // estrutura de repetição de conversão
      for (int i = 0; i < contador; i++) {

        // se o número escolhido for maior ou igual que o de comparação
        if (numero_escolhido >= comparador) {
          numero_escolhido = numero_escolhido - comparador;
          V[i] = 1;
        }

        // se o número escolhido não for maior ou igual que o de comparação
        else {
          V[i] = 0;
        }

        // divisão de número comparativo
        comparador = comparador / 2;

        // se o número  for 1 liberar permissão de printagem
        if (V[i] == 1) {
          permissao = 1;
        }

        // se for permitido printar print
        if (permissao == 1) {
          System.out.print(V[i]);
        }
      }
    }
  }
}