package facebook;

import java.io.IOException;

import baseClass.Base;

public class Main extends Base {

	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		l.login();
		
	

	}

}
