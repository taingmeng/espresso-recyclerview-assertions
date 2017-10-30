package com.taingmeng.espresso.recyclerviewassertions

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.view_holder_event.view.*

class ProgramViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

  fun update(program: Program) {
    with(itemView) {
      time.text = program.time
      title.text = program.title
    }
  }
}
