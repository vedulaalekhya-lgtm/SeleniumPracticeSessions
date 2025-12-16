package javaPracticeSessions;

import org.testng.annotations.Test;

public class SwitchCase {
	@Test
	public static void testmethod(){
		String switchname = "Hello";
		switch(switchname) {
		case "Fan":
			System.out.println("Switch on Fan");
		break;	
		case "TV":
			System.out.println("Switch on Tv");
		break;	
		case "Light":
			System.out.println("Switch on Light");	
		break;
		default:
			System.out.println("No switch is matching :" + switchname);
	}

}
}
