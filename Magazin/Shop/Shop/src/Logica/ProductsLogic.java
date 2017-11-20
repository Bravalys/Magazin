package Logica;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Product;

public class ProductsLogic {
	public ArrayList<Product> readFromDb(String productsFilePath) {
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			Scanner scanner = new Scanner(new File(productsFilePath));
			ArrayList<Product> produse = new ArrayList<Product>();
			while (scanner.hasNextLine()) {

				String nameProduct = scanner.next();
				String IdProduct = scanner.next();
				String category = scanner.next();
				float price = scanner.nextFloat();
				long stoc = scanner.nextLong();
				String descriere = scanner.next();
				Product p = new Product(nameProduct, IdProduct, category, price, stoc, descriere);
				produse.add(p);
			}
			scanner.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return products;
	}
}
