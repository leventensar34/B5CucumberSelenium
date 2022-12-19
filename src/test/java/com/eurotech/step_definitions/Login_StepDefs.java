package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    ExcelUtil excelUtil=new ExcelUtil("src/test/resources/EurotechTestB5_-Last.xlsx","Test Data");
    List<Map<String,String>> dataList=excelUtil.getDataList();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        loginPage.loginAsTeacher();

    }


    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {

        loginPage.loginAsStudent();
    }

    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {

        loginPage.loginAsDeveloper();

    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username, password);


    }

    @And("The welcome message contains {string}")
    public void theWelcomeMessageContains(String user) {

        BrowserUtils.waitFor(2);
        String actualMessage = dashboardPage.welcomeMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertTrue(actualMessage.contains(user));
    }

    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {

        BrowserUtils.waitFor(2);
        loginPage.getDisapperingWarningMessage(expectedMessage);

        // to find disappearing warning message
//       String validationMessage= Driver.get().findElement(By.id("loginpage-input-email")).getAttribute("validationMessage");
//        System.out.println("validationMessage = " + validationMessage);
//        Assert.assertEquals(expectedMessage,validationMessage);
    }


    @When("The user enters {string} and {int}")
    public void the_user_enters_and(String sheetName, Integer rowNumber) {

        loginPage.login(dataList.get(rowNumber).get("Username"),dataList.get(rowNumber).get("Password"));
    }

    @Then("The welcome message contains in excel {int}")
    public void the_welcome_message_contains_in_excel(Integer rowNumberForName) {

        String actualMessage=dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualMessage.contains(dataList.get(rowNumberForName).get("Name")));

    }


    @Then("The User verify that company name {int}")
    public void the_user_verify_that_company_name(Integer rowNumberForCompany) {
        String actualCompanyName=dashboardPage.getCompany(dataList.get(rowNumberForCompany).get("Company"));
        Assert.assertEquals(dataList.get(rowNumberForCompany).get("Company"),actualCompanyName);
    }
}
