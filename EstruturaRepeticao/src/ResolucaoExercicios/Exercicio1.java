package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		char resposta;
		do{
			System.out.println("Olá, mundo!");
			System.out.println("Deseja exibir a msg novamente (S) ou (N)?");
			resposta = scan.nextLine().charAt(0);
		}
		while (resposta == 'S'); 
		System.out.println("Adeus mundo!");
		scan.close();
	}
}
