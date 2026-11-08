import java.util.Scanner;
public class Exercicio6 {
    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static void exibirContagem(String[] frases) {
        int maior = 0;
        int posicao = 0;
        for (int i = 0; i < frases.length; i++) {
            int quantidade = contarVogais(frases[i]);
            System.out.println(frases[i] + " - vogais: " + quantidade);
            if (quantidade > maior || i == 0) {
                maior = quantidade;
                posicao = i;
            }
        }
        System.out.println("frase com mais vogais: " + frases[posicao]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frases[] = new String[3];
        for (int i = 0; i < frases.length; i++) {
            System.out.println("digite uma frase:");
            frases[i] = sc.nextLine();
        }
        exibirContagem(frases);
        sc.close();
    }
}
