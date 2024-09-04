package ResolucaoExercicios;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		int num = scan.nextInt();
		
		for (int i=4; i<=(num-1); i=i+2) {
			System.out.print("os valor pares entre 2 e o número "+num+ " que foi informado são: ");
			System.out.println(i);
		}
		scan.close();
	}
}
