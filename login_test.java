import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class login_test {
@Test
public void login() {
System.setProperty("webdriver.chrome.driver", "/home/user1/selenium/chromedriver");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://3.111.30.238:8080/admin");
WebElement username=driver.findElement(By.id("username"));
WebElement password=driver.findElement(By.id("password"));
WebElement login=driver.findElement(By.name("formSubmitButton"));
username.sendKeys("admin");
password.sendKeys("password");
login.click();
String actualUrl="http://3.111.30.238:8080/admin/home.html";
String expectedUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
}
}
