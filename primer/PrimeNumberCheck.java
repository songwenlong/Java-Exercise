/**
 * @author song
 * @description The program will prompt user to enter a number
 * and check and display whether the number is prime or not.
 */

package exercise;
import java.util.Scanner;
public class PrimeNumberCheck {
	public static void main(String args[]){
		int temp;
		boolean isPrime = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for check: ");
		
		int num = scanner.nextInt();
		for(int i = 2; i <= num /2; i++){
			temp = num%i;
			if(temp == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");
	}
}
