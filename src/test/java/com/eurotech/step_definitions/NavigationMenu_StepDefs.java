package com.eurotech.step_definitions;

import io.cucumber.java.en.Then;

public class NavigationMenu_StepDefs {

    @Then("The user should be able to sees welcome message")
    public void the_user_should_be_able_to_sees_welcome_message() {
        System.out.println("I see welcome message");
    }
    @Then("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println("I navigating developer menu");

    }
    @Then("The users able to see developer text")
    public void the_users_able_to_see_developer_text() {
        System.out.println("I see developer text");

    }

    @Then("The user navigates to All Post menu")
    public void the_user_navigates_to_all_post_menu() {
        System.out.println("I navigating All posts menu");
    }
    @Then("The users able to see Posts text")
    public void the_users_able_to_see_posts_text() {
        System.out.println("I see Posts text");
    }


    @Then("The user navigates to My Account  menu")
    public void the_user_navigates_to_my_account_menu() {
        System.out.println("I navigating My Account menu");
    }
    @Then("The users able to see dashboard text")
    public void the_users_able_to_see_dashboard_text() {
        System.out.println("I see dashboard text");
    }


}
