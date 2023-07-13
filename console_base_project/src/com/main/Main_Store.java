package com.main;

import java.util.*;
import com.backend.Control;

public class Main_Store {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Control cnt = new Control();
		char ch;
		do {
			System.out.println("Welcome to  Vstore. Please tell me what you want");
			System.out.println(
					"1.Add Product\n2.Remove Product\n3.Update Product\n4.Search Product\n5.Display Product\n6.Search By Category\n7.Display Total Value");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				cnt.Operation(choice);

				break;
			case 2:
				cnt.Operation(choice);
				break;
			case 3:
				cnt.Operation(choice);
				break;
			case 4:
				cnt.Operation(choice);
				break;
			case 5:
				cnt.Operation(choice);
				break;
			case 6:
				cnt.Operation(choice);
				break;
			case 7:
				cnt.Operation(choice);
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("Do You Want To Continue ?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("thank you........................");

	}

}
