
/**@Import Scanner Package*/
import java.util.Scanner;

/** @Creating class BankAtm */
public class Bank extends Exception implements Runnable {
	String s1;
	/** @Declaration */
	int atmId;
	String bankName, location;
	/** @Double */
	double b, c, b1, deposit, c1, c2;

	public void run() {

	}

	Bank(String s) {
		s1 = s;
	}

	/** @Method to return string in case exception occurs */
	public String toString() {
		return ("Bank exception WE ARE SORRY " + s1);

	}

	/** @Defining withdraw method */
	public void withdraw() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw ");
		b = s2.nextDouble();

		/** @TRY and CATCH to deal with exception */
		try {
			/** @logic condition if amount entered is greater than balance */
			if (b1 < 0 || b1 < b)
				throw new Bank("your balance is " + b1);

			b1 = b1 - b;

			/** @If Condition */
			if (b1 > 0) {
				/** @Deduction of balance */
				/** @b1 = b1-b; */
				System.out.println("available balance " + b1);
				c = b1;
			} else
				System.out.println("Insufficient balance");
		}
		/** @Catching exception */
		catch (Bank ex) {
			System.out.println(ex);
		}
	}

	/** @Deposit method */
	public void deposit() {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the amount to deposit ");
		b1 = s1.nextDouble();
		b1 = b1 + c;
		System.out.println("Credit amount balance " + b1);
	}

	/** @Main Method */
	public static void main(String[] args) {
		/** @Object of bankAtam class */
		Bank obj = new Bank(" Insufficient balance ");
		Thread t1 = new Thread(obj);
		t1.start();
		obj.deposit();
		obj.withdraw();

		Thread t2 = new Thread(obj);
		t2.start();
		obj.deposit();
		obj.withdraw();
		obj.withdraw();
	}
}