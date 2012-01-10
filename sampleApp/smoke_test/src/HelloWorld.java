// JUnit Assert framework can be used for verification

import net.sf.sahi.client.Browser;
import static junit.framework.Assert.*;

public class HelloWorld {

	private Browser browser;

	public HelloWorld(Browser browser) {
		this.browser = browser;
	}

	public void goToSite() throws Exception {
		browser.navigateTo("http://169.254.70.80:8081/helloworld");
	
	}

	public void validateThatIsVisible(String string1) throws Exception {
		assertEquals(string1, browser.heading2(string1).text());
		assertTrue(browser.heading2(string1).exists());
	
	}

}