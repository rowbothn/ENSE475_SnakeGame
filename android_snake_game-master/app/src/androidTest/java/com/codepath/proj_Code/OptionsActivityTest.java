package com.codepath.proj_Code;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import com.codepath.examples.basicsnakegame.R;
import com.codepath.examples.basicsnakegame.SnakeGameActivity;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.isInternal;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.assertThat;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isSelected;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.view.View;
import android.widget.TextView;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public final class OptionsActivityTest
{
    @Rule
    public ActivityScenarioRule<OptionsActivity> s1 = new ActivityScenarioRule<>(OptionsActivity.class);

//    @Before
//    public void stubAllExternalIntents() {
//        // By default Espresso Intents does not stub any Intents. Stubbing needs to be setup before
//        // every test run. In this case all external Intents will be blocked.
//
//        intending(not(isInternal())).respondWith(new Instrumentation.ActivityResult(Activity.RESULT_OK, null));
//    }

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