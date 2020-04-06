package com.codepath.proj_Code;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.codepath.examples.basicsnakegame.R;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public final class RankActivityTest {

    @Rule
    public ActivityScenarioRule<RankActivity> s1 = new ActivityScenarioRule<>(RankActivity.class);

    @Test
    public void testLayout() {
        onView(withId(R.id.rankLayout)).check(matches(isDisplayed()));
    }

    @Test
    public void testTitle(){
        onView(withId(R.id.rankTitle)).check(matches(isDisplayed()));
    }

    @Test
    public void testDate(){
        onView(withId(R.id.rankDate)).check(matches(isDisplayed()));
    }

    @Test
    public void testPoint(){
        onView(withId(R.id.rankPoint)).check(matches(isDisplayed()));
    }

}
