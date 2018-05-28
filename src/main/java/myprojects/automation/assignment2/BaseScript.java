package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static myprojects.automation.assignment2.utils.Properties.getBrowser;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     * @return New instance of {@link WebDriver} object according to DEFAULT_BROWSER property.
     */
    public static WebDriver getDriver() {
        switch (getBrowser()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                return new ChromeDriver();
            case "internet explorer":
                System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
                return new InternetExplorerDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                return new FirefoxDriver();
            default: throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
        }
    }
}
