/**
 * @author song
 * @decription Get sum of array elements
 */
package exercise;

public class SumOfArray1 {
	public static void main(String args[]){
		int[] array = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int num : array){
			sum = sum + num;
		}
		System.out.println("Sum of array elements is: " + sum);
	}
}
