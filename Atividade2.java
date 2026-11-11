import java.util.Scanner;
public class Exercicio2 {
    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "abaixo";
        } else if (imc < 25) {
            return "normal";
        } else if (imc < 30) {
            return "sobrepeso";
        } else {
            return "obesidade";
        }
    }
    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            String classificacao = classificarImc(imc);
            System.out.printf("pessoa %d: imc %.2f - %s%n", (i + 1), imc, classificacao);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesos[] = new double[4];
        double alturas[] = new double[4];
        for (int i = 0; i < pesos.length; i++) {
            System.out.println("digite o peso:");
            pesos[i] = sc.nextDouble();
            System.out.println("digite a altura:");
            alturas[i] = sc.nextDouble();
        }
        exibirRelatorio(pesos, alturas);
        sc.close();
    }
}
