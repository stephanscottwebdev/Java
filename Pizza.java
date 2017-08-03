//Stephan Scott
public class Pizza {

	/*a Using the Pizza class from last unit, modify the setSize(String size) 
		method to set the size of the pizza only if the size passed in is small,
		medium, large, extra large (ignoring the size).*/
	private String topping;
	private String size;
	private double price;
	
	public Pizza(){
		setTopping("Cheese");
		setSize("Large");
		setPrice(9.99);
	}
	
	public Pizza(String size, String topping, double price){
		setSize(size);
		setTopping(topping);
		setPrice(price);
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		/*Once you get into the method, immediately take the size to lowercase.  
		Create an if statement that checks if the size is small or medium or 
		large or extra large.  If it is, set this.size = size.  If not, assign 
		this.size = "error".*/
		final String small = "small";   
		final String medium = "medium";
		final String large = "large";   
		final String extra = "extra large";
		
		this.size = size;
		
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String repeatOrder(){
		size = getSize();
		topping = getTopping();
		price = getPrice();
		
		return ("You ordered " + size + topping + 
				" pizza, your total is $" + price + ".");	
	}


	
}
