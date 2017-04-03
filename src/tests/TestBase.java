/**
 * Created by anil on 4/3/2017.
 */
package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
    WebDriver driver;
    TestBase() {
        System.setProperty("webdriver.chrome.driver", "E:/chromedriver/chromedriver.exe");
    }

}
