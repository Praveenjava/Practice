package in.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharCount {
	public static void main(String[] args) {
		// String s = "Praveen";
		// String collect = s.chars().mapToObj(c -> (char)
		// c).collect(Collectors.toCollection(LinkedHashSet::new)).stream()
		// .map(String::valueOf).collect(Collectors.joining(","));

		// String collect = s.chars().mapToObj(c -> String.valueOf((char)
		// c)).collect(Collectors.joining(","));
		// System.out.println(collect);

		// System.out.println(collect);
//		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c)
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		collect.forEach((Character,count)->System.out.println(Character+"    "+count));

		// List<String> names = Arrays.asList("manish","sonu","sumit","aazad");
		// names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		// List<String> collect = names.stream().map(name ->
		// name.toUpperCase()).collect(Collectors.toList());
		// System.out.println(collect);

//		Map<String, Integer> collect = List.of("Mango", "Apple", "Grapes", "Orange", "Banana", "Apple", "Orange")
//		.stream().collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()))
//		.entrySet().stream().filter(e->e.getValue()==1)
//		.collect(Collectors.toMap(Map.Entry::getKey,e->e.getKey().length()));
//		System.out.println(collect);

//		Map<String, Integer> collect = List.of("Mango", "Apple", "Grapes", "Orange", "Banana", "Apple", "Orange")
//				.stream().collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting())).entrySet()
//				.stream().filter(e -> e.getValue() == 1)
//				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getKey().length()));
//		System.out.println(collect);

//		String str = "Java is a good programming language";
//		 Entry<Character, Long> orElse = str.chars().mapToObj(c->(char)c)
//				 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//				 .entrySet().stream().filter(n->n.getValue()==1).findFirst().orElse(null);
//		 System.out.println(orElse);

		//String s = "Praveen";
//		Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		collect.forEach((Character, count) -> System.out.println(Character + ":" + count));

//		String collect = s.chars().mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedHashSet::new))
//		.stream().map(String::valueOf).collect(Collectors.joining());
//		System.out.println(collect);
//		String collect = s.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining(","));
//		System.out.println(collect);
	}

}
