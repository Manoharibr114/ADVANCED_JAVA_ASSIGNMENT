package prog1;
import java.util.ArrayList;
import java.util.Collections;

public class pb3 {
	
	    public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding unsorted colors
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");

	        System.out.println("Before Sorting: " + colors);

	        // Sorting the ArrayList alphabetically
	        Collections.sort(colors);

	        // Display sorted list
	        System.out.println("After Sorting: " + colors);
	    }
	}

	

