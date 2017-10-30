package com.taingmeng.espresso.recyclerviewassertions

class ProgramProvider {
  val programs: ArrayList<Program>
    get() {
      return arrayListOf(
          Program("Registration", "08:00"),
          Program("Opening Speech by GOH", "09:00"),
          Program("Announcement of Topic", "09:20"),
          Program("Coding", "09:30"),
          Program("Lunch Reception", "12:00"),
          Program("Coding", "13:00"),
          Program("Dinner Reception", "18:00"),
          Program("Closing Speech by GOH", "19:00"),
          Program("Announcement of Winners", "19:20"),
          Program("Prize Presentation", "19:30"),
          Program("Luncky Draw", "19:45"),
          Program("Group Photo", "20:00")
      )
    }
}
