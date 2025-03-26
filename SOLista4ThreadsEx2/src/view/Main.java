package view;

import java.util.Iterator;
import java.util.Random;
import controller.*;

public class Main {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];

		Random random = new Random();

		// Inserindo números aleatórios na matriz

		for (int i = 0; i <= matriz.length - 1; i++) {

			for (int j = 0; j <= matriz[0].length - 1; j++) {

				matriz[i][j] = random.nextInt(10);

			}

		}

		//Chama 3 threads passando cada linha da matriz
		for (int i = 0; i <= matriz.length - 1; i++) {

			int[] vetor = new int[matriz[0].length];

			for (int j = 0; j <= matriz[0].length - 1; j++) {

				vetor[j] = matriz[i][j];

			}

			System.out.println("Thread para linha " + i + " com valores: " + java.util.Arrays.toString(vetor));

			ThreadController thread = new ThreadController(vetor);

			thread.start();

		}

	}

}
