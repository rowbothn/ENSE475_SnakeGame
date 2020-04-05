package com.codepath.proj_Code;

import android.app.Activity;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.rule.UiThreadTestRule;

import com.codepath.AbstractGamePanel;
import com.codepath.examples.basicsnakegame.R;
import com.codepath.examples.basicsnakegame.SnakeGamePanel;
import com.codepath.threads.TimerGameThread;

import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.equalTo;

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