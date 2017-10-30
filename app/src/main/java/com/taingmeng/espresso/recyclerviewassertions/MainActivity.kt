package com.taingmeng.espresso.recyclerviewassertions

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private val eventAdapter = ProgramAdapter()
  private val eventProvider = ProgramProvider()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    programs.adapter = eventAdapter
    eventAdapter.update(eventProvider.programs)
  }
}
