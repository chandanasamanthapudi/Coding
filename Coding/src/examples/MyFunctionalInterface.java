package examples;

//Contains one abstract method but can have multiple default and static methods.

@FunctionalInterface  //this annotation is optional.
public interface MyFunctionalInterface {
	
	void m1(); 
	
	// It Won't Allow another abstract method.
	// void m5()
	
	default void m2() {
		System.out.println("Default Method - 1");
	}
	default void m3() {
		System.out.println("Default Method - 2");
	}
	static void m4() {
		System.out.println("Static Method -1");
	}

}
