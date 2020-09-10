import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by burakergoren
 * Sample junit test code to integrate by
 */
public class JenkinsDemo
{
    private static String Base_Url = "https://www.facebook.com";
    private WebDriver driver;

    @Before
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get(Base_Url);
    }

    @After
    public void after()
    {
        driver.quit();
    }

    @Test
    public void testCasePassed()
    {
        try {
              WebElement elem = driver.findElement(By.xpath("//form[@id='login_form']"));  
              System.out.println(elem.getText());
            }
       catch(Exception e) {
                    // do nothing
                }
        
    }

    @Test
    public void testCaseFailed()
    {   
        try {
              WebElement elem = driver.findElement(By.xpath("//form[@id='failed case']"));  
              System.out.println(elem.getText());
            }
       catch(Exception e) {
                    // do nothing
                }
    }

    @Ignore
    @Test
    public void testCaseIgnored()
    {
        try {
              WebElement elem = driver.findElement(By.xpath("//form[@id='ignored case']"));  
              System.out.println(elem.getText());
            }
       catch(Exception e) {
                    // do nothing
                }
    }
}
