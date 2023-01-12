package exercicios;
//import java.util.Scanner;
import java.util.*;


public class Exercico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
	teclado.useLocale(Locale.US); // Setar o locale
	
	String aluno;
	float nota1, nota2, media, soma, mediaTurma;
	
	soma = 0;
	
	for (int i = 0; i <3; i++) {
	System.out.println("Nome do Aluno: ");
	aluno = teclado.nextLine();
	System.out.println("Nota 1: ");
	//nota1 = teclado.nextInt(); // Dará erro
	nota1 = teclado.nextFloat();
	System.out.println("Nota 2:");
	nota2 = teclado.nextFloat();
	
	teclado.nextLine();
	
	media = (nota1 + nota2)/2;
	
	soma = soma + media;
	
	System.out.printf("Média do aluno é %.1f\n", media);
	
	if (media >= 6) {
		System.out.println("Aluno Aprovado. Parabéns.");
		}else {
			System.out.println("Reprovado! Estude mais.");
		}
	}
	
	mediaTurma = soma/3;
	System.out.printf("Média da Turma = %.1f\n", mediaTurma);
	
	teclado.close();
	
	
	}

}
