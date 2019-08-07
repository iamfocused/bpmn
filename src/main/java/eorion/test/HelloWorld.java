package eorion.test;

import java.util.Arrays;
import java.util.List;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello World");
		List<String> li = Arrays.asList("Hello", ",", "World", "!");
		li.stream().map(item -> "\"" + item + "\"").forEach(System.out::print);
	}
}
