package com.aziemp66.tugas_fuad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OptionalInvestigationActivity : AppCompatActivity() {
  private lateinit var mainMenuButton: Button
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_optional_investigation)

    initalizeComponent()
  }

  private fun initalizeComponent(): Unit {
    mainMenuButton = findViewById(R.id.optional_investigation_menu)

    mainMenuButton.setOnClickListener {
      val intent = Intent(this, MainActivity::class.java)

      startActivity(intent)
    }
  }
}