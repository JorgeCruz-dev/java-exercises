package exercises.plusminus;

public class PlusMinus {
	
	/*
	 * Given an array of integers, 
	 * calculate the ratios of its elements that are positive, negative, and zero.
	 *  Print the decimal value of each fraction on a new line with 
	 *  6 places after the decimal.
	 * */
	
	
	public static void main(String args[]) {
		Integer arr[] = {1,1,0,-1,-1};
		
		calculatePlusMinus(arr);
	}

	private static void calculatePlusMinus(Integer[] arr) {
		Double positiveNumbers = 0.0;
		Double negativeNumbers = 0.0;
		Double zeroNumbers = 0.0;
		
		for (Integer i : arr) {
			if(i < 0)
				negativeNumbers++;
			if (i == 0)
				zeroNumbers++;
			if (i > 0)
				positiveNumbers++;
		}
		System.out.println(String.format("%4f", negativeNumbers/ arr.length));
		System.out.println(String.format("%4f", zeroNumbers/ arr.length));
		System.out.println(String.format("%4f",positiveNumbers/ arr.length));
	}

}
