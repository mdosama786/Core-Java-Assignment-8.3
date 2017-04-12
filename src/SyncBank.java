
/**@Import Scanner Package*/
import java.util.Scanner;

/** @Create SyncBank */
public class SyncBank extends Exception implements Runnable {
	String s1;
	/** @Declaration */
	int atmId;
	String bankName, location;
	/** @Double */
	double withdrw, c, deposit, c1, c2;

	public void run() {

	}

	public synchronized void start() {
		start();

	}

	SyncBank(String s) {
		s1 = s;
	}

	/** @Method to return string in case exception occurs */
	public String toString() {
		return ("Bank exception WE ARE SORRY " + s1);

	}

	/** @Defining withdraw method */
	public void withdraw() {
		Scanner s2 = new Scanner(System.in);
		/** @A message For user Enter withdraw amount */
		System.out.println("Enter the amount to withdraw ");
		withdrw = s2.nextDouble();

		/** @TRY and CATCH to deal with exception */
		try {
			/** @Logic condition if amount entered is greater than balance */
			if (deposit < 0)
				throw new Bank("your balance is " + deposit);

			if (deposit >= withdrw) {
				/** @Deduction of balance */
				deposit = deposit - withdrw;
				System.out.println("available balance " + deposit);
			} else
				System.out.println("Insufficient balance");
		}
		/** @Catching exception */
		catch (Bank ex) {
			System.out.println(ex);
		}
	}

	/** @Deposit method */
	public synchronized void deposit() {

		Scanner s1 = new Scanner(System.in);
		/** @A message For user Enter deposit amount */
		System.out.println("Enter the amount to deposit ");
		double amnt = s1.nextDouble();
		deposit = deposit + amnt;
		System.out.println("credit amount balance " + deposit);
	}

	/** @Main Method */
	public static void main(String[] args) {
		/** @Object of bankAtam class */
		SyncBank obj = new SyncBank(" Insufficient balance ");
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