package Logica;

import java.util.Scanner;

public class MeniuUser {

	private static int choise;

	public static void showMainMeniuUser() {
		System.out.println("Meniu:");
		System.out.println("1. Lista de produse.");
		System.out.println("2. Cauta produs.");
		System.out.println("3. Meniu utilizator.");

		boolean valid = false;
		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		do {
		switch (choise) {
		case 1:
			valid = true;
			CategoriiProduse.showMeniuProduse();
			break;
		case 2:
			valid = true;
			break;
		case 3:
			valid = true;
			MeniuUtilizator.showMeniuUtilizator();
			break;

		default:
			valid = false;
			System.out.println("Invalid");
			return;
		}
		}while(!valid);

		
	}

	public int getChoise() {
		return choise;
	}

	public void setCh(int choise) {
		this.choise = choise;
	}

}
