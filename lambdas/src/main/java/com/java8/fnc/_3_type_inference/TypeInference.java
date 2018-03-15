package com.java8.fnc._3_type_inference;

public class TypeInference {

	public static void main(String[] args) {
		// the lambda expression on the right must be matched with the type on the left - StringLength
		// the left hand side part defines the return and argument types for the lambda expression because
		// we're using the lambda as StringLength implementation 
		StringLength strLengthFnc = (String s) -> s.length();
		
		// we don't need to define a return type in the lambda. the compiler is smart to decide it on implementation result and
		// the return type is declared in the interface abstract method declaration
		// we don't require to pass the type of argument - it is declared in the StringLength
		// this is the type inference where interface defines types and we don't need to spcify them ance again in lambda declaration.
		StringLength strLengthFnc1 = s -> s.length();
		
		System.out.println(strLengthFnc.calc("abcdefg"));
		System.out.println(strLengthFnc1.calc("abcdefg"));
		
		executeLambda(strLengthFnc1, "my lambda text");
		executeLambda(t -> t.length(), "my lambda text");
	}
	
	public static void executeLambda(StringLength lambda, String text) {
		System.out.println(lambda.calc(text));
	}
	
	interface StringLength {
		int calc(String s);
	}	
}

