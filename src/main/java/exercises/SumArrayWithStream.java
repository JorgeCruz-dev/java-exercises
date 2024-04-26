package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumArrayWithStream {
	
	public static void main(String args[]) {
		Integer arr[] = {1,2,2,3,5,7,7,8,8,8,11,25};
		
		List<Integer> result = Arrays.asList(arr);
		
		System.out.println("Sum of "+ result.stream().collect(Collectors.toList()) + " is : " + result.stream().reduce(0, (a,b) -> a + b));
	}

}
