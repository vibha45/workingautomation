package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bhaskar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement unTxtbx=driver.findElement(By.className("bhaskarlogo"));
		String fontfamily=unTxtbx.getCssValue("font-family");
		String fontsize=unTxtbx.getCssValue("font-size");
		//String fontcolor=unTxtbx.getCssValue("color");
		System.out.println(fontfamily+","+fontsize);
		
		driver.findElement(By.xpath("//div[@id='withoutajax']//../ul/li[3]/a[@id='second-fold-story-5']")).click();
	}

}
