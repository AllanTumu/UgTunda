package com.example.ugtunda;

import com.example.ugtunda.Buyers.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTests {

    //Initialize the activity rule which tells directs the app which activity to start from
    @Rule
    public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    /**Verify if the user see the ShopOnline Logos*/
    @Test
    public void checkLogos() {
        onView(withId(R.id.app_logo))
                .check(matches(isDisplayed()));

    }
    /**Check if the TagLine is displayed and verify that text is right*/
    @Test
    public void checkslogan() {
        onView(withId(R.id.app_slogan))
                .check(matches(isDisplayed()))
                .check(matches(withText("MeaOfficial, The Brand that won't let you down")));

    }

    /**Verify that user sees the Join Button*/
    @Test
    public void checkJoinButton() {
        onView(withId(R.id.main_join_now_button))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()));
    }

    /**Verify that user sees the Login Button*/
    @Test
    public void checkLoginButton() {

        onView(withId(R.id.main_login_button))
                .check(matches(isDisplayed()))
                .check(matches(isClickable()))
                .check(matches(withText("Login")));

    }

    /**Verify that user sees the Sellers Link Button*/
    @Test
    public void checkSellerLink() {

        onView(withId(R.id.seller_begin))
                .check(matches(isDisplayed()))
                .check(matches(withText("I want to be a seller")));
    }

    /**Click the Login Button*/
    @Test
    public void clickLoginButton() {

        onView(withId(R.id.main_login_button))
                .perform(click());
    }

    /**Verify that user is taken to the right screen when they click the LoginButton*/
//    @Test
//    public void verifyActivity() {
//        onView(withId(R.id.login_button))
//                .check(matches(isDisplayed()))
//                .check(matches(withText("Login")));
//    }
}
