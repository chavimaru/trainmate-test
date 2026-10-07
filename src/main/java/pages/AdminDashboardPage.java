package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardPage extends BasePage {

    private final By dashboardHeading = By.xpath("//*[self::h1 or self::h2][contains(normalize-space(),'Dashboard')]");
    private final By allCohortsNav = By.xpath("//a[contains(normalize-space(),'All Cohorts')]");
    private final By trainersNav = By.xpath("//a[contains(normalize-space(),'Trainer')]");
    private final By reportNav = By.xpath("//a[contains(normalize-space(),'Report') or contains(normalize-space(),'Export')]");

    public AdminDashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return displayed(dashboardHeading);
    }

    public void openAllCohorts() {
        click(allCohortsNav);
    }

    public void openTrainerPool() {
        click(trainersNav);
    }

    public void openReports() {
        click(reportNav);
    }
}
