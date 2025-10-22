package simplyLearns.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> numberList=new ArrayList<>();
		numberList.add(12);
		numberList.add(23);
		numberList.add(9);
		numberList.add(4);
		numberList.add(20);
		System.out.println(numberList);
		
//		System.out.println("By using the for each loops");
//		List<Integer> squareList = new ArrayList<>();
//		for(Integer x:numberList) {
//			squareList.add(x*x);
//		}
//		System.out.println(squareList);
//		
//		System.out.println("By using the stream api");
//		System.out.println("===========================================");
//		List squareList=numberList.stream().map(x->x*x).collect(Collectors.toList());
//		System.out.println(squareList);
		
		System.out.println("+=========================================+");
//		Set<Integer> squareSet=new HashSet<>();
//		System.out.println("By using the for each loops");
//		for(Integer i:numberList) {
//			squareSet.add(i*i);
//		}
//		System.out.println(squareList);
		
//		System.out.println("By using the stream api");
//		Set<Integer> squareSet1= numberList.stream().map(x->x*x).collect(Collectors.toSet());
//		System.out.println(squareSet1);
		
		
		List<String> languages=new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("Cpp");
		languages.add("JavaScript");
		System.out.println(languages);
		
//		System.out.println("By using the for each loop");
//		List<String> newLang=new ArrayList<>();
//		for (String lang : languages) {
//			if(lang.startsWith("J")) {
//				newLang.add(lang);
//			}
//		}
//		System.out.println(newLang);
		
//		System.out.println("By using the Stream Api to filter the collections");
//		List<String> filterLan = languages.stream().filter(x->x.startsWith("J")).collect(Collectors.toList());
//		System.out.println("Language starts with P->"+filterLan);
		
		
//		System.out.println("By using the filter to sort the filter List");
//		List<String> sortedLang = languages.stream().sorted().collect(Collectors.toList());
//		System.out.println("Sorted language::-"+sortedLang);
		
//		
//		System.out.println("Printing elements 1 by 1");
//		languages.stream().forEach(x-> System.out.println("each element is :"+x));
//		
		
		//reduce-method
		int sum=numberList.stream().reduce(0, (ans,i)->ans+i);
		System.out.println("Sum of the List elements:"+sum);
	}

}
