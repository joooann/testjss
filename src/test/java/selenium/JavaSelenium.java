package java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaSelenium {

    @Test(description = "Test Java Selenium", groups = {"smoke"})
    public void testJavaSelenium() {
        WebDriver driver = new ChromeDriver ();
    }
}
