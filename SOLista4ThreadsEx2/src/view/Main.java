package view;

import java.util.Random;
import controller.*;

public class Main {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];
		int[] vetor = new int[matriz[0].length];

		Random random = new Random();

		for (int i = 0; i <= matriz.length - 1; i++) {

			for (int j = 0; j <= matriz[0].length; j++) {

				matriz[i][j] = random.nextInt(10);

			}

		}

		ThreadController thread = new ThreadController(vetor);

	}

}
