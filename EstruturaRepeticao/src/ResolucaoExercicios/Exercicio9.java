package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int memoria=0;
		
		System.out.println("Digite um número inteiro positivo: ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				memoria = i;
				System.out.println(memoria);
			}
		}
		scan.close();
	}

}
