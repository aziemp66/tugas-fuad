package com.aziemp66.tugas_fuad

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LifestyleActivity : AppCompatActivity() {
  private lateinit var mainMenuButton: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_lifestyle)
    initalizeComponent()

    // Load lifestyle suggestions into the ListView
    val suggestionsListView: ListView = findViewById(R.id.suggestions_list_view)

    // Retrieve the string array from the resources
    val suggestionsArray = resources.getStringArray(R.array.lifestyle_suggestions)

    // Create an ArrayAdapter to bind the string array to the ListView
    val adapter = CustomAdapter(this, suggestionsArray)

    // Set the adapter to the ListView
    suggestionsListView.adapter = adapter
  }

  private fun initalizeComponent(): Unit {
    mainMenuButton = findViewById(R.id.lifestyle_menu)

    mainMenuButton.setOnClickListener {
      val intent = Intent(this, MainActivity::class.java)

      startActivity(intent)
    }
  }

}

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
