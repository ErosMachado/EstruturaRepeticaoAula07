package ResolucaoExercicios;
import java.util.Scanner;

public class QExercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int memoria = 0;
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		int num = scan.nextInt();
		
		for(int i=2; i<=num; i++) {
			if(num%i!=0) {
				//memoria = memoria+i;
				System.out.println("de 2 at� "+num+" os primos s�o: "+i);
			}else {
				
			}
			}
		scan.close();
		}
	}
