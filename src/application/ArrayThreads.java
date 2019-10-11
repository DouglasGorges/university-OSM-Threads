package application;

import java.util.Random;

public class ArrayThreads {

	static Random generator = new Random();
	
	static int[] myArray;

	public static void main(String[] args) {
		
		myArray = new int[40];
		new ArrayThreads().arrayInput();
		
	}

	public final void arrayInput() {
		for(int i=0; i<myArray.length; i++) {
			myArray[i] = generator.nextInt(11);
		}
	}
}
