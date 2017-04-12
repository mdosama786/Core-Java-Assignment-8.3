
/**@Import Scanner Package*/
import java.util.Scanner;

/** @Creating class Withdraw */
public class Withdraw extends Exception implements Runnable {
	String s1;
	/** @Declaration */
	int atmId;
	String bankName, location;
	/** @Double */
	double b, c, b1, deposit, withdrw, c1, c2;

	public synchronized void run() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw ");
		withdrw = s2.nextDouble();

		/** @TRY and CATCH to deal with exception */
		try {
			/** @Logic condition if amount entered is greater than balance */
			if (deposit < 0)
				throw new Bank("your balance is " + deposit);
			/** @If Condition */
			if (deposit >= withdrw) {
				/** @Deduction of balance */
				deposit = deposit - withdrw;
				System.out.println("Available balance " + deposit);
			} else
				System.out.println("Insufficient balance");
		}
		/** @Catching exception */
		catch (Bank ex) {
			System.out.println(ex);
		}
	}

	Withdraw(String s) {
		s1 = s;
	}

	/** @Method to return string in case exception occurs */
	public String toString() {
		return ("Bank exception WE ARE SORRY " + s1);

	}
}