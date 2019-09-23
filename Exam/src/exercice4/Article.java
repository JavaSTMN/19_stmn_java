package exercice4;


public class Article {
	private double priceTaxeFree;
	private category cat;
	private int ref;
	private String name;
	
	public Article(double price, category theCat, int theRef, String theName) {
		this.priceTaxeFree = price;
		this.cat = theCat;
		this.ref = theRef;
		this.name = theName;
	}
	
	public category getCat() {
		return cat;
	}
	public String getNom() {
		return name;
	}
	public double getPriceTaxeFree() {
		return priceTaxeFree;
	}
	public int getRef() {
		return ref;
	}
	public void setCat(category cat) {
		this.cat = cat;
	}
	public void setNom(String name) {
		this.name = name;
	}
	public void setPriceTaxeFree(double priceTaxeFree) {
		this.priceTaxeFree = priceTaxeFree;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
}
