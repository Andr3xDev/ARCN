package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {
    WebDriver driver;

    @FindBy(css = "form#checkboxes input:nth-of-type(1)")
    WebElement checkbox1;

    @FindBy(css = "form#checkboxes input:nth-of-type(2)")
    WebElement checkbox2;

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isCheckbox1Checked() {
        return checkbox1.isSelected();
    }

    public boolean isCheckbox2Checked() {
        return checkbox2.isSelected();
    }

    public void clickCheckbox1() {
        checkbox1.click();
    }

    public void clickCheckbox2() {
        checkbox2.click();
    }
}
