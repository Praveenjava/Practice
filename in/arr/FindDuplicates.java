package in.arr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
//		int []arr = {3,4,5,6,2,1,4,3};
//		Map<Integer, Long> collect = Arrays.stream(arr).boxed()
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		collect.entrySet().stream().filter(entry->entry.getValue()==1)
//		.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));

		// List<Integer> asList = Arrays.asList(2,3,4,5);
//		Integer collect = asList.stream().collect(Collectors.reducing(0,Integer::sum));
//		System.out.println(collect);

		// Optional<Integer> reduce = asList.stream().reduce((a,b)->a*b);
		// System.out.println(reduce);

//		int[] arr = { 1, 2, 3, 4, 5 };
//		int k = 3;
//		int n = arr.length;
//
//		int[] rotated = new int[n];
//		for (int i = 0; i < n; i++) {
//			rotated[(i + k) % n] = arr[i];
//		}
//		System.out.println("Rotated Array:");
//		for (int num : rotated) {
//			System.out.print(num + "");
//		}

		int n = 5;

		for (int i = n; i >= 1; i--) {

			// print leading spaces
			for (int space = 0; space < n - i; space++) {
				System.out.print(" ");
			}

			// print numbers
			for (int num = 1; num <= i; num++) {
				System.out.print(num + " ");
			}

			System.out.println();
		}

	}

}
