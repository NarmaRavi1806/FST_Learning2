package extendPackage;

import SeleniumDay1.MethodClass;

public class overrideClass extends MethodClass{
	
	public static void main(String[] args) {
		
		overrideClass over = new overrideClass();
		over.methodTwo();
		
	}
	
	public void methodTwo() {
		System.out.println("override");
	}

}
