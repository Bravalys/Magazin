package Shop;

import Logica.Shop;

public class Main {

	public static void main(String[] args) {
		Shop magazin= new Shop("ListaProduse.txt","Login.txt");
		magazin.run();

	}

}
