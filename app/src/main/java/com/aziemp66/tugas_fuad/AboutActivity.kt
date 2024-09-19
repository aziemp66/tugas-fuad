package com.aziemp66.tugas_fuad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
  private lateinit var mainMenuButton: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_about)

    initalizeComponent()
  }

  private fun initalizeComponent(): Unit {
    mainMenuButton = findViewById(R.id.about_menu)

    mainMenuButton.setOnClickListener{
      val intent = Intent(this,MainActivity::class.java)

      startActivity(intent)
    }
  }
}