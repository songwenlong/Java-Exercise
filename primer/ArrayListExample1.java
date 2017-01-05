package exercise;
import java.util.*;

import javax.print.DocFlavor.STRING;

public class ArrayListExample1 {
	public static void main(String args[]){
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("some");
		obj.add("thing");
		obj.add("that");
		obj.add("wonderful");
		System.out.println("1 The array list is: " + obj);
		
		obj.remove(0);
		obj.remove(0); //if obj.remove(1);, the result is?
		obj.remove("that");
		System.out.println("2 The array list is: " + obj);
		
		obj.add(0,"Some");
		obj.add(1,"Thing");
		System.out.println("3 The array list is: " + obj);
	}
}
