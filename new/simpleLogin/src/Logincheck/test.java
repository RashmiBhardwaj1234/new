

import net.sourceforge.jwebunit.junit.WebTester;


import org.junit.jupiter.api.Test;

class test {

	@Test
	public void testLoginPage() 
	{
		 beginAt("index.jsp"); 
		 assertTitleEquals("Login");
		 assertLinkPresent("home");
		 clickLink("home");
		 assertTitleEquals("Home");
	}
	}
		
	
