package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static myprojects.automation.assignment2.utils.Properties.getBaseAdminUrl;
import static myprojects.automation.assignment2.utils.Properties.getBrowser;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = getDriver();
        driver.get(getBaseAdminUrl());
        System.out.println(getBrowser());
    }
}
