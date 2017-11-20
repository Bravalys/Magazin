package Model;

public class Product {
	private String nameProduct;
	private String IdProduct;
	private String category;
	private float price;
	private long stoc;
	private String descriere;
	private float vanzari;

	
	
	public Product(String nameProduct, String idProduct, String category, float price, long stoc, String descriere) {
		super();
		this.nameProduct = nameProduct;
		IdProduct = idProduct;
		this.category = category;
		this.price = price;
		this.stoc = stoc;
		this.descriere = descriere;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getIdProduct() {
		return IdProduct;
	}

	public void setIdProduct(String idProduct) {
		IdProduct = idProduct;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getStoc() {
		return stoc;
	}

	public void setStoc(long stoc) {
		this.stoc = stoc;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return"Numele produsului:"+nameProduct+"\nID produs: "+IdProduct+" \nCategorie:"+category+"\nPret:"+price+" Lei\nStoc:"+stoc+"\nDescriere:"+descriere+".\n";
}

}
