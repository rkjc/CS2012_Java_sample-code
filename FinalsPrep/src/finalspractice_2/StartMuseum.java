package finalspractice_2;

import java.util.ArrayList;
import java.util.Scanner;

import finalspractice.LandAnimal;

public class StartMuseum {

	public static void main(String[] args) {
		System.out.println("Welcome to the Museum. Enjoy your journey of discovery today as you visit the exhibits.");
		
		ArrayList<Exhibit> displays = new ArrayList<>();
		
		Exhibit ex_1 = new Exhibit();
		displays.add(ex_1);
		
		Scanner userinput = new Scanner(System.in);
		int index = 0;
		while (index < displays.size()) {
			System.out.println("Press Enter to view next exhibit");
			userinput.nextLine();
			System.out.println("--------------------------------");
			
			// display exhibit
			System.out.println("show exhibit details " + index);
			

			index += 1;
		}
		
		System.out.println("--------------------------------");
		System.out.println("Thank you for visiting the Museum. Looking forward to seeing you again in the future!");
	}
}
