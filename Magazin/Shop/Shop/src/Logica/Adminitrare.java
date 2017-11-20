package Logica;

import java.util.Scanner;

public class Adminitrare {
	private static int choise;

	public static void showMeniuAdministrare() {

		System.out.println("Meniu:");
		System.out.println("1. Adauga balanta.");
		System.out.println("2. Inapoi");

		boolean valid = false;
		Scanner sc = new Scanner(System.in);
		choise = sc.nextInt();
		do {
		switch (choise) {
		case 1:
			valid = true;
			break;
		case 2:
			valid = true;
			
			return ;
		default:
			valid = false;
			System.out.println("Invalid");
			
			return;
			}
		}while(!valid);
	}
}
