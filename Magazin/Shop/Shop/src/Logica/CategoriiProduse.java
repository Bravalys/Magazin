package Logica;

import java.util.Scanner;

public class CategoriiProduse {
	private static int choise;

	public static void showMeniuProduse() {
		System.out.println("Meniu:");
		System.out.println("1. Calculatoare:");
		System.out.println("2. SSD:");
		System.out.println("3. Inapoi.");

		boolean valid = true;
		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		do {
			switch (choise) {
			case 1:
				valid = true;
				break;
			case 2:
				valid = true;
				break;
			case 3:
				valid = true;
				return;
			default:
				valid = false;
				System.out.println("Invalid");
				return;
			}
		} while (!valid);
	}

	public int getChoise() {
		return choise;
	}

	public void setCh(int choise) {
		this.choise = choise;
	}
}
