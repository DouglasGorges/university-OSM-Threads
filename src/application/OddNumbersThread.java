package application;

public class OddNumbersThread {

	public static void main(String[] args) {

		new Thread(t2).start();
		new Thread(t3).start();
		new Thread(t1).start();
	}

	static Runnable t1 = new Runnable() {

		@Override
		public void run() {
			try {
				for (int number = 0; number <= 333; number++) {
					if ((number % 2) != 0) {
						System.out.println(number);
					}
				}
			} catch (Exception e) {
			}
		}
	};

	static Runnable t2 = new Runnable() {
		
		@Override
		public void run() {
			try {
				for (int number = 334; number <= 666; number++) {
					if ((number % 2) != 0) {
						System.out.println(number);
					}
				}
			} catch (Exception e) {
			}
		}
	};

	static Runnable t3 = new Runnable() {
		
		@Override
		public void run() {
			try {
				for (int number = 667; number <= 999; number++) {
					if ((number % 2) != 0) {
						System.out.println(number);
					}
				}
			} catch (Exception e) {
			}
		}
	};
}