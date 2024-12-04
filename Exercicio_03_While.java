package exercicio_While;

import java.util.Scanner;

public class Exercicio_03_While {

	public static void main(String[] args) {

		int idade;
		int menorde21 = 0;
		int maiorde50 = 0;

		Scanner leia = new Scanner(System.in);

		while (true) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				menorde21 = menorde21 + 1;
			} else if (idade > 50) {
				maiorde50 = maiorde50 + 1;
			}

		}

		System.out.println("\nTotal de pessoas menores de 21 anos: " + menorde21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + maiorde50);

	}

}
