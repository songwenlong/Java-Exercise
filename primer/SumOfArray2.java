/**
 * @author song
 * @description User would enter 5 elements 
 * and the program will store them into an array
 * and will display the sum of them.
 */
package exercise;

import java.util.Scanner;
public class SumOfArray2 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i < 5; i ++){
			array[i] = scanner.nextInt();
		}
		for(int num : array){
			sum += num;
		}
		System.out.println("Sum of array elements is: " + sum);
	}
}
