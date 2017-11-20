package Logica;

import java.util.ArrayList;
import java.util.Scanner;

import Logica.ProductsLogic;
import Logica.UserLogic;
import Model.Product;
import Model.User;

public class Shop {
	private ArrayList<Product> products;
	private ArrayList<User> usersDb;

	private ProductsLogic productsLogic = new ProductsLogic();
	private UserLogic usersLogic = new UserLogic();

	public Shop(String productsFilePath, String usersFilePath){
        products = productsLogic.readFromDb(productsFilePath);
        usersDb = usersLogic.readFromDb(usersFilePath);
	}
	public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        String Username = sc.next();
        System.out.println("Password:");
        String Password = sc.next();
        
        

        User user =  usersLogic.userExists(Username, Password, usersDb);
        if ( user != null){
            System.out.println("Logare cu succes!");
            if (user.getPrivilegiu() == 1) {
            MeniuAdmin.showMainMeniuAdmin();
            }
            else {
            MeniuUser.showMainMeniuUser();
            }
        }
        else {
            System.out.println("Nume de utilizator sau parola gresite.");
        }
	}
}
