package exercice3;

public abstract class Form {
	
	private double area;
	private String description;
	
	public Form(String description) throws Exception {
		this.setDescription(description);
	}
	
	abstract void calcArea() throws Exception;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
