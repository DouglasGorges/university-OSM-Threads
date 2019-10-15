package application;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ArrayThreads {

	static Random generator = new Random();


	public static void main(String[] args) throws InterruptedException {

		myArray = new int[400];
		new ArrayThreads().arrayInput();

		new Thread(t2).start();
		new Thread(t4).start();
		new Thread(t3).start();
		new Thread(t1).start();

		TimeUnit.SECONDS.sleep(1);

		long sumAll = sumThreadOne + sumThreadTwo + sumThreadThree + sumThreadFour;

		System.out.println("Soma Total do Array: " + sumAll);
	}

	static int[] myArray;
	static long sumThreadOne;
	static long sumThreadTwo;
	static long sumThreadThree;
	static long sumThreadFour;

	public final void arrayInput() {
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = generator.nextInt(11);
		}
	}

	static Runnable t1 = new Runnable() {

		@Override
		public void run() {
			try {
				for (int i = 0; i < 100; i++) {
					sumThreadOne += myArray[i];
				}
				System.out.println("Soma do Array T1: " + sumThreadOne);
			} catch (Exception e) {
			}
		}
	};

	static Runnable t2 = new Runnable() {

		@Override
		public void run() {
			try {
				for (int i = 100; i < 200; i++) {
					sumThreadTwo += myArray[i];
				}
				System.out.println("Soma do Array T2: " + sumThreadTwo);
			} catch (Exception e) {
			}
		}
	};

	static Runnable t3 = new Runnable() {

		@Override
		public void run() {
			try {
				for (int i = 200; i < 300; i++) {
					sumThreadThree += myArray[i];
				}
				System.out.println("Soma do Array T3: " + sumThreadThree);
			} catch (Exception e) {
			}
		}
	};

	static Runnable t4 = new Runnable() {

		@Override
		public void run() {
			try {
				for (int i = 300; i < 400; i++) {
					sumThreadFour += myArray[i];
				}
				System.out.println("Soma do Array T4: " + sumThreadFour);
			} catch (Exception e) {
			}
		}
	};
}
