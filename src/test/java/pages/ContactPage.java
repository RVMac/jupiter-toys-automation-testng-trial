package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.CommonFunctions;

public class ContactPage {
    private final WebDriver driver;
    private final CommonFunctions common;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        this.common = new CommonFunctions(driver);
    }

    // Locators
    By SubmitButton = By.xpath("//div[@class='form-actions']//a");

    By HeaderPageErrorMessage = By.cssSelector("div.alert.alert-error.ng-scope");
    By ForenameErrorMessage = By.id("forename-err");
    By EmailErrorMessage = By.id("email-err");
    By FeedbackMessageErrorMessage = By.id("message-err");

    By ForenameTextField = By.id("forename");
    By EmailTextField = By.id("email");
    By MessageTextField = By.id("message");

    By SendingFeedbackProgressBar = By.cssSelector("div.progress.progress-info.wait");
    By SuccessFeedbackSendingMessage = By.xpath("//div[@ui-if='contactValidSubmit']");

    // Methods
    public void clickSubmit(){
        common.click(SubmitButton);
    }

    public void verifyHeaderPageErrorMessage(boolean isDisplayed) {

        if (isDisplayed){
            common.waitForElementToBePresent(HeaderPageErrorMessage);
        } else {
            common.waitForElementToBeNotVisible(HeaderPageErrorMessage);
        }
    }

    public void verifyRequiredFieldsErrorMessages(boolean isDisplayed) {

        if (isDisplayed){
            common.waitForElementToBePresent(ForenameErrorMessage);
            common.waitForElementToBePresent(EmailErrorMessage);
            common.waitForElementToBePresent(FeedbackMessageErrorMessage);
        } else {
            common.waitForElementToBeNotVisible(ForenameErrorMessage);
            common.waitForElementToBeNotVisible(EmailErrorMessage);
            common.waitForElementToBeNotVisible(FeedbackMessageErrorMessage);
        }
    }

    public void filloutRequiredFields(String forename, String email, String message) {
        common.enterText(ForenameTextField, forename);
        common.enterText(EmailTextField, email);
        common.enterText(MessageTextField, message);
    }

    public void verifySuccessfulFeedbackSubmission() {
        common.waitForElementToBeNotVisible(SendingFeedbackProgressBar);
        common.waitForElementToBePresent(SuccessFeedbackSendingMessage);
    }
}
