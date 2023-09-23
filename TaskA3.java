package chapter3;

import java.util.LinkedList;

public class TaskA3 {

	public static void main(String[] args) {
		
		int startRange = 0;
		int endRange = 100;
		int divisor = 3;

		DividendsCalculations calculations = new DividendsCalculations();
		LinkedList<Integer> dividends = calculations.calculateDivisors(divisor, startRange, endRange);
		
		System.out.println(dividends);

	}
}

class DividendsCalculations {

	private LinkedList<Integer> dividends = new LinkedList<>();

	public LinkedList<Integer> calculateDivisors(int divisor, int startRange, int endRange) {

		int dividend = startRange;
		
		while (dividend % divisor != 0) {
			dividend = dividend + 1;			
		}
		
		while (dividend <= endRange) {
			dividends.add(dividend);
			dividend = dividend + divisor;
			
		}

		return dividends;

	}
}
