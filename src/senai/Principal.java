package senai;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nome = sc.nextLine();

		System.out.println("Digite o valor da primeira nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite o valor da segunda nota:");
		double nota2 = sc.nextDouble();
		System.out.println("Digite o valor da terceira nota:");
		double nota3 = sc.nextDouble();
		System.out.println("Digite a porcentagem da presença: ( 0 até 100)");
		double presenca = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7.0 && presenca >= 75.0) {
			System.out.println("O " + nome + ", foi aprovado com média " + String.format("%.2f", media) + " e com presenca de " + String.format("%.2f", presenca)+ " %. Parabéns.");
		} else if (media < 7.0 && presenca >= 75.0) {
			System.out.println("O " + nome + ", foi  reprovado com média " + String.format("%.2f", media) + " e aprovado com presenca de " + String.format("%.2f", presenca) + " %. Resultado: Reprovado.");
		} else if (media >= 7.0 && presenca < 75.0) {
			System.out.println("O " + nome + ", foi aprovado com média " + String.format("%.2f", media) + " e reprovado com presenca de " + String.format("%.2f", presenca) + " %. Resultado: Reprovado.");
		} else {
			System.out.print("Reprovado: Média das notas e presença insuficiente.");
		}

		sc.close();
	}

}
