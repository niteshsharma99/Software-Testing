package testpackage;

import org.testng.annotations.Test;

public class FacebookLogin {
	
	@Test
	public void loginWithValidCredentials() {

		System.out.println("Hi, I am successfully Loged-in");

	}

	@Test
	public void loginWithInValidCredentials() {

		System.out.println("Hi, I am not unable to Log-in");

	}
	
	@Test
	public void loginWithInValidUserName() {

		System.out.println("Hi, I am not unable to Log-in");

	}

}
