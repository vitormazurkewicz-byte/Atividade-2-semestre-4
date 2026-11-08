
import java.util.Scanner;
public class Exercicio1 {
    public static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";
        for (int i = 0; i < tamanho; i++) {
            linha += simbolo;
        }
        return linha;
    }
    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturas[] = new int[3];
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("digite a altura do triangulo:");
            alturas[i] = sc.nextInt();
        }
        for (int i = 0; i < alturas.length; i++) {
            desenharTriangulo(alturas[i]);
            System.out.println();
        }
        sc.close();
    }
}
