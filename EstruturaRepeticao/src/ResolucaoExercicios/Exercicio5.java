package ResolucaoExercicios;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num1=0, num2=0;
		
		for(int i=1;i<=12;i++) {
		System.out.println("Informe o "+i+"º valor: ");
		num1 = scan.nextDouble();
		if(num1>num2) {
			num2=num1;
		}
		}
		System.out.println("O maior número digitado é o: "+num2);
		scan.close();
	}
}
