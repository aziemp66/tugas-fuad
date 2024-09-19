package com.aziemp66.tugas_fuad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  private lateinit var aboutButton: Button
  private lateinit var historyButton: Button
  private lateinit var physicalButton: Button
  private lateinit var investigationButton: Button
  private lateinit var optionalInvestigationButton: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    initializeComponent()
  }

  private fun initializeComponent(): Unit {
    aboutButton = findViewById(R.id.menu_about)
    historyButton = findViewById(R.id.menu_history)
    physicalButton = findViewById(R.id.menu_physical)
    investigationButton = findViewById(R.id.menu_investigation)
    optionalInvestigationButton = findViewById(R.id.menu_optional_investigation)

    aboutButton.setOnClickListener {
      val intent = Intent(this, AboutActivity::class.java)

      startActivity(intent)
    }

    investigationButton.setOnClickListener {
      val intent = Intent(this, InvestigationActivity::class.java)

      startActivity(intent)
    }

    optionalInvestigationButton.setOnClickListener {
      val intent = Intent(this, OptionalInvestigationActivity::class.java)

      startActivity(intent)
    }
  }
}