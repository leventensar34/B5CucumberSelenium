package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenu_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Then("The user should be able to sees welcome message")
    public void the_user_should_be_able_to_sees_welcome_message() {

    }

    @Then("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {

        dashboardPage.navigateToMenu("Developers");

    }

    @Then("The user navigates to All Post menu")
    public void the_user_navigates_to_all_post_menu() {

    }

    @Then("The users able to see Posts text")
    public void the_users_able_to_see_posts_text() {
        BrowserUtils.waitFor(2);
        dashboardPage.myPostsText.getText();
    }


    @Then("The users able to see dashboard text")
    public void the_users_able_to_see_dashboard_text() {
        dashboardPage.dashboardText.getText();

    }

    @Then("The user navigates to Post page")
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(2);
        String actualText = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualText.contains("Welcome"));

    }

    public void the_user_navigates_to_post_page() {
        BrowserUtils.waitFor(2);
        dashboardPage.navigateToSubMenu("My Posts");

    }


    @Then("The user navigates to Dashboard page")
    public void the_user_navigates_to_dashboard_page() {
        dashboardPage.navigateToSubMenu("Dashboard");

    }


    @And("The user navigates to {string} page")
    public void theUserNavigatesToPage(String name) {
        dashboardPage.navigateToSubMenu(name);
    }

    @And("The user navigates to {string} menu")
    public void theUserNavigatesToMenu(String menuName) {

        dashboardPage.navigateToMenu(menuName);
    }

    @Then("The users should able to see header as {string}")
    public void theUsersShouldAbleToSeeHeaderAs(String headerName) {
        BrowserUtils.waitFor(1);
        String actualHeader = dashboardPage.getHeaderText(headerName);
        Assert.assertEquals("Verify that header name is display", headerName, actualHeader);
    }
}
