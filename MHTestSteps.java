package com.adp.vantage.stepdefinition;


import com.adp.vantage.dataproviders.CSVFileReader;
import com.adp.vantage.managers.DriverFactory;
import com.adp.vantage.managers.DriverManager;
import com.adp.vantage.panels.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class MHTestSteps extends EmployeeProfileAddresses {


    private Login login;

    public MHTestSteps(DriverManager manager, Login login)
    {
        this.login = login;

    }

    @Override
    public void setBrowserLoadTimeout(int seconds) {
        super.setBrowserLoadTimeout(seconds);
    }


    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='January']")
    public WebElement januaryLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'January')]")
    public WebElement januaryPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='February']")
    public  WebElement februaryLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'February')]")
    public WebElement februaryPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='March']")
    public  WebElement marchLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'March')]")
    public WebElement marchPage;


    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='April']")
    public  WebElement aprilLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'April')]")
    public WebElement aprilPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='May']")
    public  WebElement mayLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'May')]")
    public WebElement mayPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='June']")
    public  WebElement juneLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'june')]")
    public WebElement junePage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='July']")
    public  WebElement julyLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'July')]")
    public WebElement julyPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='August']")
    public  WebElement augustLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'August')]")
    public WebElement augustPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='September']")
    public  WebElement septemberLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'September')]")
    public WebElement septemberPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='October']")
    public  WebElement octoberLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'October')]")
    public WebElement octoberPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='November']")
    public  WebElement novemberLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'November')]")
    public WebElement novemberPage;

    @FindBy(xpath="//ul[@class='nav navbar-nav']/li/a[text()='December']")
    public  WebElement decemberLink;

    @FindBy(xpath="//div[@class='title']/h2[contains(text(),'December')]")
    public WebElement decemberPage;

    @FindBy(xpath="//div[@class='title']/h2")
    public  WebElement monthTitle;

    @FindBy(xpath="//form[@class='shoe_search form-horizontal']")
    public  WebElement homepage;

    @FindBy(xpath="//ul[@id='shoe_list']/li")
    public  WebElement shoelistcount;

    @FindBy(xpath="//div[@class='shoe_result']/table/tbody//tr/td[contains(@class,'shoe_description')]")
    public  WebElement shoedescription;

    @FindBy(xpath="//div[@class='shoe_result']/table/tbody//tr/td[contains(@class,'shoe_name')]")
    public  WebElement shoename;

    @FindBy(xpath="//div[@class='shoe_result']/table/tbody//tr/td[contains(@class,'shoe_brand')]")
    public  WebElement shoebrand;

    @FindBy(xpath="//div[@class='shoe_result']/table/tbody//tr/td[contains(@class,'shoe_price')]")
    public  WebElement shoeprice;

    @FindBy(xpath="//div[@class='shoe_result']/table/tbody//tr/td[contains(@class,'shoe_image')]")
    public  WebElement shoeimage;

    @FindBy(xpath="//form[@id='remind_email_form']/label")
    public  WebElement remindmeformFieldLabel;

    @FindBy(xpath="//form[@id='remind_email_form']/input[@id='remind_email_input']")
    public  WebElement remindmeformEmail;

    @FindBy(xpath="//form[@id='remind_email_form']/input[@id='remind_email_submit']")
    public  WebElement remindmeformEmailSubmit;

    @FindBy(xpath="//div[@id='flash']/div")
    public  WebElement EmailMsg;






    /**
     * Open browser and navigate to url
     *
     */
    @Given("I open Chrome and navigate to {string}")
    public void openChromeAndNavigateToURL(String url) throws Exception {

        DriverFactory.getDriver().get(url);
        DriverFactory.getDriver().navigate().refresh();
        DriverFactory.getDriver().manage().window().maximize();
        waitForElementVisible(homepage,15);


    }

    /**
     * Verify a link for each month of the year is displayed
     */
    @Then("A link for each month of the year is displayed")
    public void verifyLinkForEachMonth() throws Exception{
        saveScreenShot(DriverFactory.getDriver());
        assert isElementPresent(januaryLink);
        assert isElementPresent(februaryLink);
        assert isElementPresent(marchLink);
        assert isElementPresent(aprilLink);
        assert isElementPresent(mayLink);
        assert isElementPresent(juneLink);
        assert isElementPresent(julyLink);
        assert isElementPresent(augustLink);
        assert isElementPresent(septemberLink);
        assert isElementPresent(octoberLink);
        assert isElementPresent(novemberLink);
        assert isElementPresent(decemberLink);

    }

    /**
     * Click the month link
     * @param month
     * @throws Exception
     */
    @When("I click the month link for {string}")
    public void clickTheMonthLink(String month)	throws Exception {
        String monthtext;
        this.setBrowserLoadTimeout(5);
        switch (month) {

            case "January":
               try {
                   januaryLink.click();
                }
                catch (TimeoutException e) {
                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "February":
                try {
                    februaryLink.click();
                }
                catch (TimeoutException e) {
                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);

                saveScreenShot(DriverFactory.getDriver());
                break;

            case "March":
                try {
                    marchLink.click();
                }
                catch (TimeoutException e) {
                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "April":
                try {
                    aprilLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "May":
                try {
                    mayLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "June":
                try {
                    juneLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "July":
                try {
                    julyLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "August":
                try {
                    augustLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "September":
                try {
                    septemberLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "October":
                try {
                    octoberLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "November":
                try {
                    novemberLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            case "December":
                try {
                    decemberLink.click();
                }
                catch (TimeoutException e) {

                }
                monthtext = monthTitle.getText();
                System.out.println("MONTH " + monthtext);
                saveScreenShot(DriverFactory.getDriver());
                break;

            default:
                break;
        }



    }

    /**
     * Verify the month page loads
     */
    @Then("I verify the page loads for {string}")
    public void verifyTheMonthPage(String month)	throws Exception {
        System.out.println("verifyTheMonthPage");
        String monthtitle = monthTitle.getText();
        assert monthtitle.contains(month);
    }


    /**
     * Verify list of shoes
     */
    @Then("I verify a list of shoes is displayed")
    public void verifyListOfShoes()	throws Exception {

        assert isElementPresent(shoelistcount);

    }

    @Then("I verify a description for each shoe is displayed")
    public void verifyADescriptionIsDisplayed() {
        assert isElementPresent(shoedescription);

    }

    @Then("I verify a suggested price for each shoe is displayed")
    public void verifyASuggestedPriceIsDisplayed() {
        assert isElementPresent(shoeprice);
    }



    @Then("I verify an image for each shoe is displayed")
    public void verifyAnImageIsDisplayed() {
        assert isElementPresent(shoeimage);
    }

    @Then("I verify the label for the email address field")
        public void verifyAnEmailFieldExists(){
        String fieldlabel = remindmeformFieldLabel.getText();
        System.out.println("Email field label " + fieldlabel);
        Assert.assertEquals(fieldlabel,"Remind me of new shoes");

    }
    @Then("I verify the input field for the email address")
        public void verifyAnEmailInputFieldExists(){
            assert isElementPresent(remindmeformEmail);
        }

    @Then("I verify the submit button for the email address")
        public void verifyAnEmailSubmitButtonExists(){
            assert isElementPresent(remindmeformEmailSubmit);
        }


    @When("I click the email Submit button")
    public void clickEmailSubmit(){
        System.out.println("Click Submit");
        remindmeformEmailSubmit.click();
        System.out.println("After Click Submit");
    }

    @Then("I verify the reminder message to enter an email")
    public void verifyNoEmailMessage(){
        String noEmail;
        System.out.println("Verify Message");
        noEmail = EmailMsg.getText();
        Assert.assertEquals(noEmail,"Please enter an email address");
    }

    @When("I enter an email address {string}")
    public void setRemindMeEmail(String email){
        remindmeformEmail.sendKeys(email);
    }

    @Then("I verify the email submit message {string}")
    public void verifyEmailSubmitMessage(String email){
        String submitmessage;
        System.out.println("Verify Message");
        submitmessage = EmailMsg.getText();
        Assert.assertEquals(submitmessage,"Thanks! We will notify you of our new shoes at this email: " + email);
    }

    @Then("I verify the invalid email submit message {string}")
    public void verifyInvalidEmailSubmitMessage(String email){
        String submitmessage;
        System.out.println("Invalid Emain Message");
        submitmessage = EmailMsg.getText();
        Assert.assertEquals(submitmessage,"Invalid email format. Ex. name@example.com");
    }
}

