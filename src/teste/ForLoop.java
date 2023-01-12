package teste;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0; // Fique mudando ess variável e teste
		
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i <5; i++) {
			System.out.println("Informe seu nome:");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade:");
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem "+ idade + " anos");
		}
		
		teclado.close();
		
	}

}
