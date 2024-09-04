package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		for (int i=0; i<=25;i++) {
			System.out.println(n +" X "+i+" = "+(i*n) );
		}	
		scan.close();
	}
}
