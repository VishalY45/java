package giritechhub;

class FoodItem
{
     private int id;
     private String Name;
     private double price;
     private String category;
     private String descripition;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescripition() {
		return descripition;
	}
	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}
     
}

