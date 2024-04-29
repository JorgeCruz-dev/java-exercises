package exercises.minimaxsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
	
	/*
	 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
	 *  Then print the respective minimum and maximum values as a single line of two space-separated long integers. 
	 * 
	 * input arr  = [1,3,5,7,9]
	 * 
	 * expected output
	 * 16 24
	 * */
	
	public static void main(String args[]) {
		Integer[] arr = {9,3,7,5,1};
		calculate(arr);
	}

	private static void calculate(Integer[] arr) {
		List<Integer> minMaxArr = Arrays.asList(arr);
		Collections.sort(minMaxArr);
		
		Integer minSum = minMaxArr.stream().limit(4).reduce(0, (subtotal, element) -> subtotal + element);
		
		Collections.sort(minMaxArr, Collections.reverseOrder());
		
		Integer maxSum = minMaxArr.stream().limit(4).reduce(0, (subtotal, element) -> subtotal + element);
		
		System.out.println(+ minSum + " " + maxSum);
			
		
	}
	

}
