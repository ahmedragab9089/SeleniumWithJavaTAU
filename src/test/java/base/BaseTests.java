package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setUp();
    }



}
