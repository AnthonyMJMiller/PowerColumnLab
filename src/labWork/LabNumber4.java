package labWork;

import java.util.Scanner;

public class LabNumber4 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		String userName, confirm;
		int numberEnt, value;
		int squared = 2, cubed = 3;

		do {
			System.out.println("Hello, may I have you name please?");

			userName = num.next();

			System.out.println("Okay " + userName
					+ ", please enter in a number so I can display a table of powers leading up to that number: ");

			numberEnt = num.nextInt();

			System.out.printf("%-30s%n%-30s%n", "Number\tSquared\t Cubed", "======\t=======\t =====");

			for (value = 1; value <= numberEnt; value++) {
				mathEquations(value, squared, cubed);

			}
			System.out.println("Do you want to enter in another number " + userName
					+ "? (Type Yes to continue or type any other key to stop)");
			confirm = num.next();
		} while (confirm.equalsIgnoreCase("Yes"));

		System.out.println("Thank you for your participation " + userName + ". Goodbye!");

		num.close();

	}

	public static void mathEquations(int value, int squareD, int cubeD) {
		int powTwo = 2, powThree = 3;

		squareD = (int) Math.pow(value, powTwo);
		cubeD = (int) Math.pow(value, powThree);

		System.out.printf("%-7d %-7d  %-7d%n", value, squareD, cubeD);
	}

}
