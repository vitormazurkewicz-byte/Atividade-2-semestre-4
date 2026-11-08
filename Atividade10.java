import java.util.Scanner;
public class Exercicio10 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }
    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
        System.out.println("soma: " + somar(v));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidade de numeros:");
        int n = sc.nextInt();
        if (n < 1 || n > 30) {
            System.out.println("quantidade invalida");
            sc.close();
            return;
        }
        int numeros[] = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = fibonacci(i);
        }
        exibir(numeros);
        sc.close();
    }
}
