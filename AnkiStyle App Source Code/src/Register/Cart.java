package Register;

import java.util.*;

class Cart {

	// To publicly access the quantity as it updates every time you wish to buy
	// again
	public static int total_quantity = 0;
	// I have declared 4 products here
	public static String[] products = { null, "1.) COTTON FABRIC SAREE     200.00",
			"2.) SILK          SAREE     100.00", "3.) KANJEEVARAM   SAREE     300.00",
			"4.) BANARASI      SAREE     400.00" };
	// Prices in accordance of their elements
	public static int[] product_price = { 0, 200, 100, 300, 400 };
	// This is the cart for the check-out of all order you have
	public static int[] final_qty = new int[5];
}

class Choose_product extends Cart {
	public void choose() {
		try (Scanner s = new Scanner(System.in)) {
			int choose, quantity;
			int p1 = 0;
			int p2 = 0;
			int p3 = 0;
			int p4 = 0;
			char decision;
			System.out.println("\t\t\t\t  WELCOME TO ANKISTYLE APP, please choose any of the menu there.. \t \t\t\t\t\t\n");
			
			do {

				for (int i = 0; i < products.length; i++) {
					if (products[i] != null)
						System.out.println(products[i]);
				}

				System.out.print("Choose any item: ");
				choose = s.nextInt();

				System.out.print("How many pieces? ");
				quantity = s.nextInt();

				switch (choose) {
				case 1:
					p1 += quantity;
					final_qty[1] = p1;
					break;

				case 2:
					p2 += quantity;
					final_qty[2] = p2;
					break;

				case 3:
					p3 += quantity;
					final_qty[3] = p3;
					break;

				case 4:
					p4 += quantity;
					final_qty[4] = p4;
					break;
				}
				System.out.print("Would you like to order again? Y/N / y/n: ");
				decision = s.next().charAt(0);
			} while (decision != 'n' && decision != 'N');

			System.out.println("==Final Cart==");
			System.out.println("\t\\Item\t\\Qty\t\\Total");
			int sum = 0;
			for (int i = 0; i < final_qty.length; i++) {
				if (final_qty[i] != 0) {
					System.out.println(products[i] + "\\" + final_qty[i] + "\\" + final_qty[i] * product_price[i]);
					sum = sum + final_qty[i] * product_price[i];
				}
			}
			System.out.println("Total Purchased items: " + (p1 + p2 + p3 + p4));
			System.out.println("Total Purchase: " + sum);
			int payment = 0;
			do {
				System.out.print("Enter Payment: ");
				payment = s.nextInt();
			} while (sum > payment);
			System.out.println("Thank you for buying! here's your change: " + (payment - sum));
		}
	}

}
