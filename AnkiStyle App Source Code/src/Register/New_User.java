package Register;

import java.util.*;

class Register1 {
	private String f_name;
	private String l_name;
	public String username;
	public String password;
	private long mob_number;

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMob_number() {
		return mob_number;
	}

	public void setMob_number(long mob_number) {
		this.mob_number = mob_number;
	}

	void register_data(Register1 r) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Enter your First name ");
			String F_Name = sc.nextLine();
			r.setF_name(F_Name);

			System.out.println(" Enter your Last name ");
			String L_Name = sc.nextLine();
			r.setL_name(L_Name);

			System.out.println(" Enter Mobile number ");
			long Mob_number = sc.nextLong();
			r.setMob_number(Mob_number);

			System.out.println(" Create username ");
			String username = sc.next();
			r.setUsername(username);

			System.out.println("Create  Password ");
			String password = sc.next();
			r.setPassword(password);
		}
		System.out.println("         Register Successfully        ");

	}

	void read_data(Register1 r) {
		System.out.println(r.getF_name());
		System.out.println(r.getL_name());
		System.out.println(r.getMob_number());
		System.out.println(r.getUsername());
		System.out.println(r.getPassword());
	}
}

class Login extends Register1 {
	
	public void USER_LOGIN() {
		while(true) {
		try (Scanner scanner = new Scanner(System.in)){
		System.out.println("enter username ");
		String keyusername = scanner.next();
		System.out.println("enter Password ");
		String keypassword = scanner.next();
		if ("user".equals(keyusername) && "pass123".equals(keypassword)) {
			System.out.println("          Username & password Enterd Correctly       ");
			System.out.println("         Press 1 to go Main Menu                     ");
		} else {

			System.out.println("          Wrong Username & password                  ");
		}
		
		break;
	}}
		 
	}
	public  void Choose() {
		while(true) {
		// To publicly access the quantity as it updates every time you wish to buy
		// again
		final int total_quantity = 0;
		// I have declared 4 products here
		final String[] products = { null, "1.) COTTON FABRIC SAREE     200.00", "2.) SILK          SAREE     100.00",
				"3.) KANJEEVARAM   SAREE     300.00", "4.) BANARASI      SAREE     400.00", "4.) Modern      SAREE     800.00"};
		// Prices in accordance of their elements
		final int[] product_price = { 0, 200, 100, 300, 400 ,800};
		// This is the cart for the check-out of all order you have
		final int[] final_qty = new int[6];

		// class Choose_product extends Cart {
		// public void choose() {
		try (Scanner s = new Scanner(System.in)) {
			int choose, quantity;
			int p1 = 0;
			int p2 = 0;
			int p3 = 0;
			int p4 = 0;
			int p5 = 0;
			char decision;
			System.out.println(
					"\t\t\t\t  WELCOME TO ANKISTYLE APP, please choose any of the menu there.. \t \t\t\t\t\t\n");

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
			System.out.println("Total Purchased items: " + (p1 + p2 + p3 + p4 + p5));
			System.out.println("Total Purchase: " + sum);
			int payment = 0;
			do {
				System.out.print("Enter Payment: ");
				payment = s.nextInt();
			} while (sum > payment);
			System.out.println("Thank you for buying! here's your change: " + (payment - sum));
		}
		break;
	}}
}

class Admin_login {

	private String admin_uname;
	private String admin_pass;
	Scanner sc = new Scanner(System.in);

	public void admin_login() {
		System.out.println("Enter the Admin UserName");
		admin_uname = sc.nextLine();
		System.out.println("Enter the Admin Password");
		admin_pass = sc.nextLine();

		if ("Admin".equals(admin_uname) && "Admin123".equals(admin_pass)) {
			System.out.println("          Username & password Enterd Correctly       ");
		} else {

			System.out.println("          Wrong Username & password                  ");
		}
	}

}

public class New_User {

	public static void main(String args[]) {
		System.out.println("*************** WELCOME TO ANKISTYLE APP********************");
		System.out.println("***********\b\b\b\b INDIA'S FIRST SELLING APP \b\b\b\b************");
		Scanner scan = new Scanner(System.in);
		System.out.println("                        1.USER  LOGIN                       ");
		System.out.println("                        2.ADMIN LOGIN                       ");
		System.out.println("     NEW TO THE APP.....3.REGISTER HERE                     ");
		int input = scan.nextInt();
		scan.close();
		Login l = new Login();
		switch (input) {
		
		case 1:
			l.USER_LOGIN();
			break;
		case 2:
			Admin_login a = new Admin_login();
			a.admin_login();
			break;
		case 3:
			Register1 r = new Register1();
			r.register_data(r);
			r.read_data(r);
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
			break;

		}
		Choose_product c = new Choose_product();
		c.choose();

	}
}
