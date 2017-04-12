
/**@Import Scanner Package*/
import java.util.Scanner;

/** @Creating class Deposit */
public class Deposit implements Runnable {
	String s1;
	/** @Declaration */
	int atmId;
	String bankName, location;
	/** @Double */
	double b, c, b1, deposit, c1 = 0, c2;

	public synchronized void start() {
		start();
	}

	Thread t1 = new Thread(new Runnable() {

		public void run() {

			Scanner s1 = new Scanner(System.in);
			/** @A message For user Enter deposit amount */
			System.out.println("Enter the amount to deposit ");
			double amnt = s1.nextDouble();
			deposit = deposit + amnt;
			System.out.println("credit amount balance " + deposit);

		}
	});

	/** @Deposit method */
	public static void main(String[] args) {
		/** @Object of bankAtam class */
		Deposit obj = new Deposit();
		Thread t1 = new Thread(obj);
		t1.start();
		Withdraw obj1 = new Withdraw(" Insufficient balance ");
		Thread t2 = new Thread(obj1);
		t2.start();
	}

	public void run() {
		/** @TODO Auto-generated method stub */
	}
}