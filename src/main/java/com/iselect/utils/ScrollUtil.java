package com.iselect.utils;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class ScrollUtil {

	
	public void scroll(WebDriver driver,WebElement ele)
	{
		
		  Point p=ele.getLocation();
		  JavascriptExecutor js = (JavascriptExecutor)driver; 
		  js.executeScript("window.scrollBy("+0+","+p.getY()+")");
		 
	}
	
	public void scrollIntoViewByJavaScript(WebDriver driver,WebElement ele)
	{
		  JavascriptExecutor js = (JavascriptExecutor)driver; 
		  js.executeScript("arguments[0].scrollIntoView()", ele);
	}
	
	public static void Scroll(WebDriver driver,WebElement ele)
	{
		
		  Point p=ele.getLocation();
		  JavascriptExecutor js = (JavascriptExecutor)driver; 
		  js.executeScript("window.scrollBy("+0+","+p.getY()+")");
		 
	}
}
