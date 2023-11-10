package calculadora;

import java.util.Scanner;

public class CalculadoraJava {
	public static void main(String[] args) {

		System.out.println("\n Calculadora em Java!");
		System.out.println("\n----------------------------\n");

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um valor de sua preferência:  \n");
		double valor1 = leitor.nextInt();

		System.out.println("\nDigite um segundo valor de sua preferência: \n");
		double valor2 = leitor.nextInt();

		System.out.println("\nQual operação deseja realizar? A - adicao, S- subtracao, M- multiplicação, D- divisão\n");
		char opcao = leitor.next().charAt(0);

		switch (opcao) {
		case 'A':
		case 'a':
			double adicao = valor1 + valor2;
			System.out.println("\nA adição dos valores resultou em: " + adicao);
			break;

		case 'S':
		case 's':
			double subtracao = valor1 - valor2;
			System.out.println("\nA subtração dos valores resultou em: " + subtracao);
			break;

		case 'M':
		case 'm':
			double multiplicacao = valor1 * valor2;
			System.out.println("\nA multiplicacao dos valores resultou em: " + multiplicacao);
			break;

		case 'D':
		case 'd':
			double divisao = valor1 / valor2;
			System.out.println("\nA divisão dos valores resultou em: " + divisao);
			break;

		default:
			System.out.println("\nEssa opcao é inexistente");
			break;
			
			//finalização da calculadora
      
		}

	}
}
