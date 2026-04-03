package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CheckboxesPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckboxesSteps {
    private WebDriver driver;
    private CheckboxesPage checkboxesPage;

    @Before("@checkboxes")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Given("the user is on the checkboxes page")
    public void the_user_is_on_the_checkboxes_page() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        checkboxesPage = new CheckboxesPage(driver);
    }

    @When("the user checks checkbox 1")
    public void the_user_checks_checkbox_1() {
        checkboxesPage.clickCheckbox1();
    }

    @When("the user unchecks checkbox 2")
    public void the_user_unchecks_checkbox_2() {
        checkboxesPage.clickCheckbox2();
    }

    @Then("checkbox 1 should be checked")
    public void checkbox_1_should_be_checked() {
        assertTrue(checkboxesPage.isCheckbox1Checked());
    }

    @Then("checkbox 1 should be unchecked")
    public void checkbox_1_should_be_unchecked() {
        assertFalse(checkboxesPage.isCheckbox1Checked());
    }

    @Then("checkbox 2 should be checked")
    public void checkbox_2_should_be_checked() {
        assertTrue(checkboxesPage.isCheckbox2Checked());
    }

    @Then("checkbox 2 should be unchecked")
    public void checkbox_2_should_be_unchecked() {
        assertFalse(checkboxesPage.isCheckbox2Checked());
    }

    @After("@checkboxes")
    public void tearDown() {
        driver.quit();
    }
}
