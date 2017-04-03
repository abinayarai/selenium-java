/**
 * Created by anil on 4/3/2017.
 */
package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;

public class FirstTest extends TestBase {
    @Before
    public void before() {
        driver = new ChromeDriver();
    }

    @Test
    public void initialTest() {

        driver.get("http://www.google.com");
        assertEquals(1, 1);
    }

    @After
    public void after() {
        driver.quit();
    }
}
