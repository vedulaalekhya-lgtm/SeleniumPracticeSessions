package javaPracticeSessions;

import org.testng.annotations.Test;

public class JavaPractice {
	@Test
	public static void testMethod() {
		// TODO Auto-generated method stub
		// addition();
		// methodinput(10, 10);
		// methodoutput(11, 12, 13);
		// MethodCallingConcepts MethCall = new MethodCallingConcepts();
		// MethCall.main(args);
		// MethodCallingConcepts.main(args);
		ifmethod();
	}
	public static void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
	public static void methodinput(int x, int y) {
		int z = x * y;
		System.out.println("The value of z is:" + z);
	}
	public static int methodoutput(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("The sum of threee variabes is :" + sum);
		return sum;
	}
	// Practicing If and else
	public static void ifmethod() {
		String PlaceName = "NO name";
		if (PlaceName == "India") {
			System.out.println("Hello India");
		} else if (PlaceName == "Europe") {
			System.out.println("Hello Europe");
		} else {
			System.out.println("No Place Name is Matching");
		}

	}

}
