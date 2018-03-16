//package com.piatakha.generic;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.IntFunction;
//
//public class GenericDemo {
//	
//	public static void main(String[] args) {
//		Z<Parent> z = new Z<>(new Child());
//		
//		
//		
////		List<Integer> listInteger = new ArrayList<>();
////		List list2 = listInteger;
////		List<String> listString = list2;
////		listString.add("asd");
//	
//		List<Child> list = new ArrayList<>();
//		
//		
//		
////		someMethod(list);
//		String[] arr =  {"as", "s"};
//		String[] array = Arrays.stream(arr).filter((str) -> str.length() < 1).toArray(String[]::new);
//	}
//	
//	
////	public static void someMethod(List<? extends Parent> list) {
////		list.add(new Child());
////	}
//
//}
//
//class Z<T extends Parent> {
//	
//	private T someField;
//	
//	public Z(T t) {
//		this.someField = t;
//	}
//	
//	public T getSomeField() {
//		return this.someField;
//	}
//	
//	public <E> E someMethod(E t) {
//		return null;
//	}
//	
//}
//
//
//class Parent  {
//	
//}
//
//class Child extends Parent {
//	
//}
//
//
//
