package Logica;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


import Model.Customer;
import Model.User;


public class UserLogic {
	public ArrayList<User> readFromDb(String usersFilePath) {
        ArrayList<User> users = new ArrayList<User>();
        try {
        	Scanner sc = new Scanner(new File(usersFilePath));
        	 while(sc.hasNextLine()){
                 int userType = sc.nextInt();
                 String name = sc.next();
                 String desc = sc.next();
                 int privilegiu = sc.nextInt();
                // if ( userType == 0){
                     users.add(new Customer(name, desc, privilegiu));
                  //  }
        	 }
        	 sc.close();
        }
        catch (Exception ex){
        	System.out.println(ex);
        }
        return users;
        }
	
    	public User userExists(String username, String password, ArrayList<User> usersDb) {
        for ( User u : usersDb) {
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
