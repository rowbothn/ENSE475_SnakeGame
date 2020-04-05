package com.codepath.proj_Code;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import com.codepath.examples.basicsnakegame.R;

import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public final class MainActivityTest
{
    @Rule
    public ActivityScenarioRule<MainActivity> s = new ActivityScenarioRule<>(MainActivity.class);

//    @Test
//    public void startGame_Test() {
//        String a = SnakeGamePanel.class.getName();
//        onView(withId(R.id.startButton)).perform(click());
//        onView(withClassName(equalTo(SnakeGamePanel.class.getName()))).check(matches(withText(a)));
//    }

    @Test
    public void optionsActivity_Test() {
        onView(withId(R.id.optionButton)).perform(click());
        onView(withId(R.id.optionsLayout)).check(matches(isDisplayed()));
    }
}