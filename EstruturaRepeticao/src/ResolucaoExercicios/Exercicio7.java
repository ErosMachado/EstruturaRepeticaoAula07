package ResolucaoExercicios;
import java.util.Scanner;


public class Exercicio7 {

	public static void main(String[] args) {
		double notaAluno;
		int numSuperior=0, numInferior=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a m�dia da sala: ");
		double mediaSala = scan.nextDouble();
		
		for(int i=1; i<=20; i++) {
			System.out.println("Informe a m�dia do aluno n�mero "+i);
			notaAluno = scan.nextDouble();
			if(notaAluno>mediaSala) {
				numSuperior= numSuperior+1;
			}else if(notaAluno<mediaSala) {
				numInferior = numInferior+1;
			}else {
				
			}
		}
		System.out.println("O n�mero de alunos que tiveram nota acima da m�dia da sala foi "+numSuperior);
		System.out.println("O n�mero de alunos que tiveram nota abaixo da m�dia da sala foi "+numInferior);
		scan.close();
	}
}
