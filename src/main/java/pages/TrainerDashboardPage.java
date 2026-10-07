package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrainerDashboardPage extends BasePage {

    private final By dashboardHeading = By.xpath("//*[self::h1 or self::h2][contains(normalize-space(),'Dashboard')]");
    private final By assignedCohortsNav = By.xpath("//a[contains(normalize-space(),'Assigned') or contains(normalize-space(),'Cohort')]");
    private final By mailboxNav = By.xpath("//a[contains(normalize-space(),'Mailbox') or contains(normalize-space(),'Notification')]");

    public TrainerDashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed() {
        return displayed(dashboardHeading);
    }

    public void openAssignedCohorts() {
        click(assignedCohortsNav);
    }

    public void openMailbox() {
        click(mailboxNav);
    }
}