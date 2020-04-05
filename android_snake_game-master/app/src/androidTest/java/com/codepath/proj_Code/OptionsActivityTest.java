package com.codepath.proj_Code;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import com.codepath.examples.basicsnakegame.R;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

public final class OptionsActivityTest
{
    @Rule
    public ActivityScenarioRule<OptionsActivity> s1 = new ActivityScenarioRule<>(OptionsActivity.class);

    @Test
    public void cancelBtn_Test() {
        onView(withId(R.id.cancelButton)).perform(click());
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.menuLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void saveBtn_Test() {
        onView(withId(R.id.saveButton)).perform(click());
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.menuLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void spinner_Test() {
        onView(withId(R.id.difficultySpinner)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is("Medium"))).perform(click());
        onView(withId(R.id.difficultySpinner)).check(matches(withSpinnerText(containsString("Medium"))));
    }

    @Test
    public void stateSaved_Test() {
        String selectedText = "Medium";

        onView(withId(R.id.difficultySpinner)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is(selectedText))).perform(click());
        onView(withId(R.id.saveButton)).perform(click());

        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.optionButton)).perform(click());
        onView(withId(R.id.difficultySpinner)).check(matches(withSpinnerText(containsString(selectedText))));
    }
}