package ResolucaoExercicios;
import java.util.Scanner;
public class Exercicios4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		double n=0, soma=0;
		
		for (int i=1; i<=10; i++) {
			
		System.out.println("Informe o "+i+ "� n�mero");
		n = scan.nextInt();
		soma = soma+n; //
		
		}
		System.out.println("A soma total de todos os n�meros digitados �: "+soma);
		scan.close();
	}
}
