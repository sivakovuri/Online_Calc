import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();			
		driver.get("https://www.online-calculator.com/full-screen-calculator/");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_4);		
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);		
		r.keyPress(KeyEvent.VK_5);
		r.keyRelease(KeyEvent.VK_5);
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		r.keyPress(KeyEvent.VK_CLEAR);
		r.keyRelease(KeyEvent.VK_CLEAR);
		
		System.out.println("Addition is Successfully Done");
		
		
		driver.get("https://www.online-calculator.com/full-screen-calculator/");
		
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);		
		r.keyPress(KeyEvent.VK_DIVIDE);
		r.keyRelease(KeyEvent.VK_DIVIDE);		
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		r.keyPress(KeyEvent.VK_CLEAR);
		r.keyRelease(KeyEvent.VK_CLEAR);
		
		System.out.println("Division is Successfully Done");	
		
		driver.close();
	}

}
