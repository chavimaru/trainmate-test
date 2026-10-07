package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By username = By.cssSelector("input[name='email'], input[type='email']");
    private final By password = By.cssSelector("input[name='password'], input[type='password']");
    private final By loginButton = By.xpath("//button[normalize-space()='Sign In' or normalize-space()='Login']");
    private final By errorMessage = By.cssSelector("[role='alert'], .error, .text-red-500");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterUsername(String value) {
        type(username, value);
        return this;
    }

    public LoginPage enterPassword(String value) {
        type(password, value);
        return this;
    }

    public void login() {
        click(loginButton);
    }

    public void loginAs(String email, String passwordValue) {
        enterUsername(email);
        enterPassword(passwordValue);
        login();
    }

    public String getErrorMessage() {
        return text(errorMessage);
    }
}
