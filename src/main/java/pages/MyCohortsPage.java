package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MyCohortsPage extends BasePage{
    private final By exportButton = By.xpath("//button[contains(normalize-space(),'Export') or contains(normalize-space(),'Download')]");
    private final By reportRows = By.cssSelector("tbody tr");

    public MyCohortsPage(WebDriver driver) {
        super(driver);
    }

    public int getDisplayedRowCount() {
        return driver.findElements(reportRows).size();
    }

    public void exportReport() {
        click(exportButton);
    }
}
