package com.epicodus.alcshop;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Guest on 11/17/16.
 */


public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
        public void beerButtonClicks() {
        onView(withId(R.id.beerButton)).perform(click());
    }

    @Test
    public void whiskeyButtonClicks() {
        onView(withId(R.id.whiskeyButton)).perform(click());
    }
}
