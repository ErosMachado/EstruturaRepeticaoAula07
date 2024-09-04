package ResolucaoExercicios;
import java.util.Scanner;


public class Exercicio7 {

	public static void main(String[] args) {
		double notaAluno;
		int numSuperior=0, numInferior=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a média da sala: ");
		double mediaSala = scan.nextDouble();
		
		for(int i=1; i<=20; i++) {
			System.out.println("Informe a média do aluno número "+i);
			notaAluno = scan.nextDouble();
			if(notaAluno>mediaSala) {
				numSuperior= numSuperior+1;
			}else if(notaAluno<mediaSala) {
				numInferior = numInferior+1;
			}else {
				
			}
		}
		System.out.println("O número de alunos que tiveram nota acima da média da sala foi "+numSuperior);
		System.out.println("O número de alunos que tiveram nota abaixo da média da sala foi "+numInferior);
		scan.close();
	}
}
