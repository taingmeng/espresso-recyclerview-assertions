package com.taingmeng.espresso.recyclerviewassertions

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class ProgramAdapter : RecyclerView.Adapter<ProgramViewHolder>() {

  private val programs = ArrayList<Program>()

  override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProgramViewHolder {
    val view = LayoutInflater.from(parent?.context).inflate(R.layout.view_holder_event, parent, false)
    return ProgramViewHolder(view)
  }

  override fun onBindViewHolder(holder: ProgramViewHolder?, position: Int) {
    holder?.update(programs[position])
  }

  override fun getItemCount() = programs.size

  fun update(programs: ArrayList<Program>) {
    this.programs.clear()
    this.programs.addAll(programs)
  }
}
