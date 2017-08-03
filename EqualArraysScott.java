//Stephan Scott
import java.util.Arrays;
public class EqualArraysScott {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4};
		int[] array2 = {4,2,3,1};
		int[] array3 = {1,2,3,4};
		int[] array4 = {4,3,2,1};
	}
		//boolean equal = true;
		public static boolean EqualArray(int array) {
			
		for (int i = 0; i < array1.length; i++){
			if (array1[i] != array2[i]){
				return false;
			}else if(array1[i] != array3[i]){
				return true;
			}
		}
		}	
	}
}
