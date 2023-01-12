package estruturaDeDados;

public class Execucao {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); // Isntanciei e criei o objeto aluno1
		Aluno aluno2 = new Aluno();
		Aluno aluno3 =new Aluno();
		
		aluno1.setNome("Luiz");
		aluno2.setNome("Maiara");
		aluno3.setNome("Luiza");
Vetor lista = new Vetor();

// Adicionar aluno aluno em uma dada posição
lista.adicionar(aluno1);
lista.adicionar(aluno2);
lista.adicionar(aluno3);

System.out.println(lista);
	}

}
