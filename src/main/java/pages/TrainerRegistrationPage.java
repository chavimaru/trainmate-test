package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrainerRegistrationPage extends BasePage {

    private final By name = By.cssSelector("input[name='name']");
    private final By email = By.cssSelector("input[name='email'], input[type='email']");
    private final By skills = By.cssSelector("input[name='skills'], textarea[name='skills']");
    private final By experience = By.cssSelector("input[name='experience']");
    private final By availabilityStart = By.cssSelector("input[name='availabilityStart']");
    private final By availabilityEnd = By.cssSelector("input[name='availabilityEnd']");
    private final By workloadLimit = By.cssSelector("input[name='workloadLimit']");
    private final By saveButton = By.xpath("//button[normalize-space()='Save' or contains(normalize-space(),'Register')]");
    private final By validationMessage = By.cssSelector("[role='alert'], .error, .text-red-500");

    public TrainerRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public TrainerRegistrationPage enterName(String value) { type(name, value); return this; }
    public TrainerRegistrationPage enterEmail(String value) { type(email, value); return this; }
    public TrainerRegistrationPage enterSkills(String value) { type(skills, value); return this; }
    public TrainerRegistrationPage enterExperience(String value) { type(experience, value); return this; }
    public TrainerRegistrationPage enterAvailabilityStart(String value) { type(availabilityStart, value); return this; }
    public TrainerRegistrationPage enterAvailabilityEnd(String value) { type(availabilityEnd, value); return this; }
    public TrainerRegistrationPage enterWorkloadLimit(String value) { type(workloadLimit, value); return this; }

    public void save() { click(saveButton); }

    public String getValidationMessage() {
        return text(validationMessage);
    }
}

