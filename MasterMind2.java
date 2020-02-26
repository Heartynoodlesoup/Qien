package mastermindgame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MasterMind2 {

	public static void main(String[] args) {
		int[] secretCode = new int[4];
		int[] inputPlayer = new int[4];
		System.out.println("Mastermind Game");
		for (int i = 0; i < secretCode.length; i++) { //laatjes worden gevuld, als i (0) kleiner is dan lengte van array, index 0 wordt 1
			Random nummer = new Random();
			int rnd = nummer.nextInt(6); //verzint random nummers 1-6
			secretCode[i] = rnd;
		}

		System.out.println(Arrays.toString(secretCode)); // het te raden geheime code 

		while (true) {
			System.out.println("Voer 4x een getal tussen 1 en 6 in:");
			Scanner sc = new Scanner(System.in);
			String keyboardPlayer = sc.nextLine(); 
			for (int j = 0; j < inputPlayer.length; j++) {
				char getal1 = keyboardPlayer.charAt(j);		// T, trucje ASCII 
				int getal2 = getal1 - '0';
				inputPlayer[j] = getal2;
			}

			System.out.println(Arrays.toString(inputPlayer));

			int teller = 0; //telt aantal goede indexes met .length

			if (secretCode[0] == inputPlayer[0] && secretCode[1] == inputPlayer[1] && secretCode[2] == inputPlayer[2]
					&& secretCode[3] == inputPlayer[3]) {	// Als alle 4 true, dan print
				System.out.println("Je hebt de code gekraakt.");
				break;
			
			} else {
				for (int k = 0; k < inputPlayer.length; k++) {
					if (inputPlayer[k] == secretCode[k]) {
						teller++;
					}
				}
				System.out.println(teller + " staan op de juiste plek.");
			}
		}
		System.out.println("Spel is afgelopen.");
	}
}
