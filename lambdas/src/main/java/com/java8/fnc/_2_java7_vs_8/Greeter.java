package com.java8.fnc._2_java7_vs_8;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		
		// with anonymous inner class of type Greeting with in-line implementation
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.print("Hello world!");
			}
		};
		greeter.greet(innerClassGreeting);
		
		// with concrete class which implements the Greeting interface
		Greeting concreteClassHello = new HelloWorldGreeting();
		greeter.greet(concreteClassHello);
		
		// with lambdas of type Greeting			
		greeter.greet(() -> System.out.print("Hello world!"));
		Greeting lambdaGreeting = () -> System.out.print("Hello world!");		
		greeter.greet(lambdaGreeting);
		lambdaGreeting.perform();
	}

}



