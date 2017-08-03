//Stephan Scott
public class PizzaTestScott implements PizzaConstants{
	public static void main (String [] args) {

		System.out.println("Welcome to " + COMPANY);
		System.out.println(getSpecial());
		
		
	Pizza myPizza = new Pizza();
	
	String size = myPizza.getSize();
	String topping = myPizza.getTopping();
	double price = myPizza.getPrice();
	
	System.out.println("You ordered a " + size + " " + topping + " pizza, "
			+ "your total is $" + price + ".");
	
	Pizza yourPizza = new Pizza("Extra Large ", "Pepperoni", 13.99);
	String order = yourPizza.repeatOrder();
	
	System.out.println(order);
	yourPizza.setPrice(12.99);
	yourPizza.setTopping("Mushroom");
	
	String changeOrder = yourPizza.repeatOrder();
	System.out.print(changeOrder);
	
	Pizza thirdPizza = new Pizza("extra small ", "Pepperoni ", 7.99);
	String changedOrder = thirdPizza.repeatOrder();
	System.out.print(changedOrder);
	}
	public static String getSpecial(){
		return "Today's special is a large 1-topping pizza for $7.99";
	}
	}

