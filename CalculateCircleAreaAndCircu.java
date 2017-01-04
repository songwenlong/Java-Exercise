/**
 * @author song
 * @description Program to calculate area and circumference of circle
 * with user interaction. User will be prompt to enter the radius and 
 * the result will be calculated based on the provided radius value.
 */


package exercise;

import java.util.Scanner;

public class CalculateCircleAreaAndCircu {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		double area = Math.PI*(radius * radius);
		System.out.println("The area of circle is: " + area);
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of the circle is: " + circumference);
	}
}
