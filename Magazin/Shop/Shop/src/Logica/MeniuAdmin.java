package Logica;

import java.util.Scanner;

public class MeniuAdmin {

	private static int choise;

	public static void showMainMeniuAdmin() {
		System.out.println("Meniu:");
		System.out.println("1. Lista de produse.");
		System.out.println("2. Cauta produs.");
		System.out.println("3. Meniu utilizator.");
		System.out.println("4. Meniu admin.");
		boolean valid = false;
		do {
			

		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		
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
		case 4:
			valid = true;
			;
			break;
		default:
			valid = false;
			System.out.println("Invalid");
			break;
		}
		
		}while(!valid);
	}

	public int getChoise() {
		return choise;
	}

	public void setChoise(int choise) {
		this.choise = choise;
	}

}
