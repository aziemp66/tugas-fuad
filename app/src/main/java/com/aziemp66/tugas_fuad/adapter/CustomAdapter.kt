package com.aziemp66.tugas_fuad.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.aziemp66.tugas_fuad.R

class CustomAdapter(private val context: Context, private val data: Array<String>) :
  ArrayAdapter<String>(context, 0, data) {
  override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
    val listItem =
      convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

    val textView = listItem.findViewById<TextView>(R.id.item_text)
    textView.text = getItem(position)

    return listItem
  }
}
