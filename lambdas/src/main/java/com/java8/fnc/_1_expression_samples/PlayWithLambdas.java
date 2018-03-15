package com.java8.fnc._1_expression_samples;

public class PlayWithLambdas {

	public static void main(String[] args) {
		
		playWithSingleArgFunc();
		
		playWithTwoArgFunc();
	}

	private static void playWithSingleArgFunc() {
		SingleIntArgFnc fnc = (int a) -> {return a*2;};
		
		// as our expression is singleline we may skip the {} and return statement
		// you can't use return statement without enclosing with {}
		SingleIntArgFnc fnc1 = (int a) -> a*2;
		
		// we're passingsingle parameter. so we may skip the () and type passing - it is declared in our
		// interface (actually it is functional interface)
		SingleIntArgFnc fnc2 = a -> a*2;		
		
		System.out.println("fnc eval: " + fnc.calc(3));
		System.out.println("fnc eval1: " + fnc1.calc(5));
		System.out.println("fnc eval2: " + fnc2.calc(7));
	}
	
	private static void playWithTwoArgFunc() {
		TwoIntArgFnc fncSum = (a, b) -> a + b;
		System.out.println("fncSum eval: " + fncSum.calc(3,5));
		
		// we require the {} as more then one line statement is executed
		TwoIntArgFnc fncDivide = (a, b) -> {
			if (b == 0) {
				return 0;
			}
			return a / b;
		};
		System.out.println("fncDivide eval: " + fncDivide.calc(8,3));
	}

}