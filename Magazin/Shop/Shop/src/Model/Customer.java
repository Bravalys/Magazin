package Model;

public class Customer extends User {

	private int buget;
	
	
	public Customer(String username, String password,int privilegiu) {
		super(username, password, privilegiu);
	}
	
	public void addBudget(int buget){
        this.buget = buget;
    }

	
}
