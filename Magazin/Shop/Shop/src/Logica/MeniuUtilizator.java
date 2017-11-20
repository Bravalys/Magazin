package Logica;

import java.util.Scanner;

public class MeniuUtilizator {
	private static int choise;

	public static void showMeniuUtilizator() {

		System.out.println("Meniu:");
		System.out.println("1. Adauga balanta.");
		System.out.println("2. Inapoi");
		boolean valid = false;
		do {
		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		switch (choise) {
		case 1:
			valid = true;
			break;
		case 2:
			valid = true;
			return;
		default:
			valid = false;
			System.out.println("Invalid");
			return;
		}
		}while(!valid);

	}

	int getChoise() {
		return choise;
	}

	public void setCh(int choise) {
		this.choise = choise;
	}
}
