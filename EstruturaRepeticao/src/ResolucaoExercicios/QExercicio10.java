package ResolucaoExercicios;
import java.util.Scanner;
public class QExercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = 2; i <= numero; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
