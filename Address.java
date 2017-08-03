//Stephan Scott
public class Address {
	
	private String houseNumber;
	private String street;
	private String apartmentNumber;
	private String city;
	private String state;
	private String zip;
	
	/*Supply two constructors that accept all the address components except one 
	includes an apartment number and one without (refer to the tester class 
	below to see the proper order*/
	
	public Address(String houseNumber, String street, String city, String state, String zip){
		setHouseNumber(houseNumber);
		setStreet(street);
		setCity(city);
		setState(state);
		setZip(zip);
	}
	public Address(String houseNumber, String street, String apartmentNumber, String city, String state, String zip){
		setHouseNumber(houseNumber);
		setStreet(street);
		setApartmentNumber(apartmentNumber);
		setCity(city);
		setState(state);
		setZip(zip);
	}

	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) throws IllegalArgumentException{
		if (state.length() == 2){
		this.state = state;
		}else if (state.length() > 2)
			System.out.println("Please enter a two digit state");
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip)throws IllegalArgumentException {
		if(zip.length() == 5){
		this.zip = zip;
		}else if(zip.length() > 5)
			System.out.println("Zip code is too long.");
		else if (zip.length() < 5){
			System.out.println("Zip code is too short.");
		}
	}

	public void print(){
		houseNumber = getHouseNumber();
		street = getStreet();
		apartmentNumber = getApartmentNumber();
		city = getCity();
		state = getState();
		zip = getZip();
		
		//if (apartmentNumber == null)
	     //   this.use = null; trying to have fun with the null...not sure how to make it blank.
		
		System.out.println("Your address is: \n" 
				+ houseNumber + " " + street + " " + apartmentNumber + 
				"\n" + city + " " + state + ", " + zip );
		
	}

}
