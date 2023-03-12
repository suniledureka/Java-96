package co.edureka.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);
		System.out.println(nums);
		
		/*
		Stream<Integer> evenStream = nums.stream().filter(n -> n%2==0);		
		List<Integer> evenNums = evenStream.collect(Collectors.toList());
		*/
		List<Integer> evenNums = nums.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
	}

}
