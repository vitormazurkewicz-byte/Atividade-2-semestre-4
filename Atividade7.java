import java.util.Scanner;
public class Exercicio7 {
    public static String gerarIniciais(String nomeCompleto) {
        String partes[] = nomeCompleto.trim().split("\\s+");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            iniciais += partes[i].charAt(0);
            if (i < partes.length - 1) {
                iniciais += ".";
            }
        }
        return iniciais.toUpperCase();
    }
    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            String iniciais = gerarIniciais(nomes[i]);
            System.out.println((i + 1) + ". " + nomes[i].toLowerCase() + " (" + iniciais + ".)");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomes[] = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("digite o nome :");
            nomes[i] = sc.nextLine();
        }
        exibirChamada(nomes);
        sc.close();
    }
}
