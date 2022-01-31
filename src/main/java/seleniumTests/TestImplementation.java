package seleniumTests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestImplementation {

    WebDriver driver;

    @BeforeClass
    public static void setupWebdriverChromeDriver() {
        System.out.println("hellow");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");

    }

    @Before
    public void setup() {
        System.out.println("hellow1");
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        System.out.println("hellow2");
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void verifyGitHubTitle() {
        driver.get("https://www.github.com");
        assertThat(driver.getTitle(), containsString("GitHub"));
    }
}

