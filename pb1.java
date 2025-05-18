package prog1;
import java.util.*;
public class pb1 {
	
	    public static void main(String[] args) {
	        // Creating an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding elements to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        // Displaying all colors
	        System.out.println("Colors: " + colors);

	        // Searching for "Red" in the list
	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available.");
	        } else {
	            System.out.println("Color 'Red' is not available.");
	        }
	    }
	}
