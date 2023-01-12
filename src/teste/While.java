package teste;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0;
		
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		while (idade >= 0) { // Atenção, os operadores precisam explícitos
			System.out.println("Informe seu nome:");
			nome = teclado.nextLine();
			
			System.out.println("Informe seu idade:");
			//idade = teclado.nextInt(); //Isso vai gerar um bug
			
			// Isso soluciona o bug
			idade = Integer.parseInt(teclado.nextLine());
		
		System.out.println(nome + " tem" + idade + " anos");
		
		break;
		}
	
		teclado.close();
	}
	

}
