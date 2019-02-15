/*
 * Name: Nicholas Gingras
 * Student ID: 040923430
 * Course & Section: CST8132 302
 * Assignment: Lab 1
 * Date: January, 7th, 2019
 */

public class Main {
	public static void main(String[] args) {
		int maxAmount = 5;

		for(int i = 0; i < maxAmount; i++) {// the amount of spaces starts at 4 descends to 0 and the amount dollar signs starts at 1 and increases to 5  
			for (int x = (maxAmount - i); x>1 ; x--) {
				System.out.print(" ");
			}
			for (int y = maxAmount - i; y < maxAmount + 1; y++) {
				System.out.print("$");
			}
			System.out.println();
		}

		System.out.println();

		for(int i =0; i < maxAmount; i++) {// there are no spaces as they aren't needed to make the dollar signs look right, the dollar signs start at 1 and increase to 5
			for (int x = (maxAmount - i); x < maxAmount + 1; x++) {
				System.out.print("$");
			}
			System.out.println();
		}

		System.out.println();

		for(int i = 0; i < maxAmount; i++) {// the blanks start at 0 and increase to 4 and the dollar signs start at 5 and decrease to 1
			for (int x = (maxAmount - i); x < maxAmount; x++) {
				System.out.print(" ");
			}
			for (int y = maxAmount; y > i ; y--) {
				System.out.print("$");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0;i < maxAmount; i++) {//there are no spaces as they aren't needed to correctly format the dollar signs, the dollar signs start at 5 and decrease to 1
			for(int x = i; x < maxAmount; x++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
