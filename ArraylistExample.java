import java.util.ArrayList;

 public class ArraylistExample {

 	public static void main(String[] args) {

 		// Declare and initialize ArrayList of integers
 		ArrayList<Integer> list = new ArrayList<Integer>();

 		// Add values to the list
 		list.add(50);
 		list.add(150);
 		list.add(200);
 		list.add(250);
 		list.add(300);

 		for(Integer num: list) {
 			System.out.println(num);
 		}

 	}
 }