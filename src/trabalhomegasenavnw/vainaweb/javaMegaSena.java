package trabalhomegasenavnw.vainaweb;

import java.util.Scanner;
import java.util.Random;

public class javaMegaSena {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numerosEscolhidos = new int[7];
		int[] numerosSorteio = new int[7];
		int numAcertos = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println("Digite um número(0 a 100): ");
			numerosEscolhidos[i] = sc.nextInt();
		}
		Random aleatorio = new Random();
		for (int i = 0; i < 7; i++) {
			numerosSorteio[i] = aleatorio.nextInt(101);
			System.out.println("Números sorteados: " + numerosSorteio[i]);
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (numerosEscolhidos[i] == numerosSorteio[j]) {
					numAcertos++;
				}
			}
		}
		System.out.println("Nº de acertos: " + numAcertos);
		switch (numAcertos) {
		case 5:
			System.out.println("Parabéns! Você ganhou 10 mil reais!!");
			break;
		case 6:
			System.out.println("Parabéns! Você ganhou 50 mil reais!!");
			break;
		case 7:
			System.out.println("Parabéns! Você ganhou 200 mil reais!!");
			break;
		default:
			System.out.println("Que pena! Tente novamente na próxima Mega Sena!!");

		}
		sc.close();

	}
}
