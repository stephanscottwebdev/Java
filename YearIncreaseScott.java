//Stephan Scott
public class YearIncreaseScott {
	public static void main(String[] args) {

       
          int year;     //Changed nums to ints, added ;'s.
          final int START_YEAR = 2015;      
          final int FACTOR = 5;    
          final int END_YEAR = 2045;   //Changed it to 30 years from start year.
          year = START_YEAR; //added the word final to the constant.

     while (year <= END_YEAR) {//Added ( )   
          System.out.println(year);
          year += FACTOR;
     }
    


}
}