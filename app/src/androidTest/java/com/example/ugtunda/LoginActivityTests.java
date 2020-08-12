package com.example.ugtunda;

import androidx.test.filters.LargeTest;

import com.example.ugtunda.Buyers.LoginActivity;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.PositionAssertions.isAbove;
import static androidx.test.espresso.assertion.PositionAssertions.isBelow;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
public class LoginActivityTests{

    @Rule
    public final ActivityRule<LoginActivity> login = new ActivityRule<>(LoginActivity.class);

    /**
     * Verify that user see the Shop online Logo
     */
    @Test
    public void checkShopLogo() {
        onView(withId(R.id.login_applogo))
                .check(matches(isDisplayed()))
                .check(isAbove(withId(R.id.login_phone_number_input)));
    }

    /**
     * Verify the user sees the Phone number field with all the required Parameters
     */
    @Test
    public void checkPhoneNUmberField() {

        onView(withId(R.id.login_phone_number_input))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()))
                .check(isAbove(withId(R.id.login_password_input)))
                .perform(click())
                .perform(clearText())
                .perform(typeText("0700764974"));
    }

    /**
     * Verify the user sees the Password field with all the required Parameters
     */
    @Test

    public void checkPasswordField() {

        onView(withId(R.id.login_password_input))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()))
                .check(isBelow(withId(R.id.login_phone_number_input)))
                .perform(click())
                .perform(clearText())
                .perform(typeText("1234567"));
    }

    /**
     * Verify the user sees forgot Password text
     */
    @Test
    public void forgotPasswordLink() {

        onView(withId(R.id.forgot_password_link))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()))
                .check(matches(withText("Forgot Password?")))
                .perform(click());
    }


    /**
     * Verify that the Login Button is visible and has the right text
     */
    @Test
    public void checkLoginButton() {

        onView(withId(R.id.login_button))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()))
                .check(matches(withText("Login")));

    }

    /**Click the Login Button*/
    @Test
    public void clickLoginButton() {

        onView(withId(R.id.login_button))
                .perform(click());
    }

    /**Check Admin Panel Link*/
    @Test
    public void checkAdminPanelLink() {
        onView(withId(R.id.admin_panel_link))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()))
                .check(matches(withText("I'm an Admin?")))
                .perform(click());
    }

}
