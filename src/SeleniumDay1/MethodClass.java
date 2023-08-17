package SeleniumDay1;

public class MethodClass {
	

	//normal method need an object to call this method
	public static void methodOne() {
		System.out.println("execute");
	}
	
//	public static void main(String[] args) {
//		
//		System.out.println("***********");
//		MethodClass method = new MethodClass();
//		method.methodTwo();
//		methodOne();
//	}
	
	//static method doesn't need an object
	public void methodTwo() {
		System.out.println("method 2 static method");
	}

}
