package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite um n�mero inteiro positivo: ");
            while (!scan.hasNextInt()) { 
                System.out.println("Entrada inv�lida! Digite um n�mero inteiro positivo: ");
            }
            num = scan.nextInt();
            if (num <= 0) {
                System.out.println("O n�mero deve ser positivo!");
            }
        } while (num <= 0);
        int soma = 0;
        for (int i = 1; i <= num; i++) {
            soma += i;
        }
        System.out.println("A soma total �: " + soma);
        scan.close();
    }
}
