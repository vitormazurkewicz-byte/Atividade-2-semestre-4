import java.util.Scanner;
public class Exercicio8 {
    public static String maiorPalavra(String[] palavras) {
        String maior = "";
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }
        return maior;
    }
    public static void exibirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i + 1) + ". " + palavras[i]);
        }
        System.out.println("total de palavras: " + palavras.length);
        System.out.println("maior palavra: " + maiorPalavra(palavras));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma frase:");
        String frase = sc.nextLine().trim();
        String palavras[] = frase.split("\\s+");
        exibirPalavras(palavras);
        sc.close();
    }
}
