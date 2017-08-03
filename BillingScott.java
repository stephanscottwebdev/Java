//Stephan Scott
public class BillingScott {

	public static void main(String[] args) {
		System.out.format("%.2f",(computePhotoBill(19.99)));   // 21.59
		computePhotoBill(19.99, 2);   // 43.18
		System.out.println();
		computePhotoBill (19.22, 2, .1);   // 37.36
		System.out.println();
	}
	public static void computePhotoBill(double price ){
		double total = (price * .08);
		System.out.println(total + price);
	}
	public static void computePhotoBill(double price, int quantity){
		double total = (price * quantity);
		System.out.print(total);
	}
	public static void computePhotoBill(double price, int quantity, double coupon){
		double total = (price * quantity - coupon);
		System.out.print(total);
	}
}
