package com.taingmeng.espresso.recyclerviewassertions

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import com.taingmeng.espresso.recyclerviewassertions.CustomAssertions.Companion.hasItemCount
import com.taingmeng.espresso.recyclerviewassertions.CustomMatchers.Companion.withItemCount
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
  @Rule
  @JvmField
  var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

  @Test
  fun countPrograms() {
    onView(withId(R.id.programs))
        .check(matches(withItemCount(12)))
  }

  @Test
  fun countProgramsWithViewAssertion() {
    onView(withId(R.id.programs))
        .check(hasItemCount(12))
  }
}
