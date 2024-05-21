package UI_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  
import org.testng.asserts.SoftAssert;

  
public class DriverManager {  
  
    public static void main(String[] args) throws InterruptedException {  
        
    	//System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\Driver");
    	
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Driver\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
    
    driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
    driver.manage().window().maximize();
    /*
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();

    //add item in cart
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    
    
    Thread.sleep(3000);

    //select value from Dropdown
    
    Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
    dropdown.selectByVisibleText("Price (low to high)");
    
    //Scroll down the webpage by 4500 pixels  
    
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("scrollBy(0,4500)");
    
    driver.findElement(By.id("react-burger-menu-btn")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("inventory_sidebar_link")).click();

    //soft assertion
   SoftAssert Assert = new SoftAssert();
   String AssertMSG = driver.findElement(By.className("footer_copy")).getText();
   System.out.println(AssertMSG);
   Assert.assertEquals(AssertMSG, "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");
   Assert.assertAll();
       
   //check added item 
   driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
   String cart = driver.findElement(By.xpath("//div[@class='cart_item']/div/a/div[text()='Sauce Labs Backpack']")).getText();
   
   System.out.println(cart);
*/
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.
    
    document.
    driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("ccvn");
    Thread.sleep(3000);
    
    driver.close();
    
    
    
    }  
  
	}

