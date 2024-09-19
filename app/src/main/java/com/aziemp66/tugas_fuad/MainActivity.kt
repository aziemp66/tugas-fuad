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
  private lateinit var lifestyleButton: Button
  private lateinit var medicalTherapyButton: Button
  private lateinit var surgicalIntervention: Button

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
    lifestyleButton = findViewById(R.id.menu_lifestyle)
    medicalTherapyButton = findViewById(R.id.menu_medical_therapy)
    surgicalIntervention = findViewById(R.id.menu_surgical_intervention)

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

    historyButton.setOnClickListener {
      val intent = Intent(this, HistoryActivity::class.java)

      startActivity(intent)
    }

    physicalButton.setOnClickListener {
      val intent = Intent(this, PhysicalActivity::class.java)

      startActivity(intent)
    }

    lifestyleButton.setOnClickListener {
      val intent = Intent(this, LifestyleActivity::class.java)

      startActivity(intent)
    }

    medicalTherapyButton.setOnClickListener {
      val intent = Intent(this, MedicalTherapyActivity::class.java)

      startActivity(intent)
    }

    surgicalIntervention.setOnClickListener {
      val intent = Intent(this, surgicalIntervention::class.java)

      startActivity(intent)
    }

  }
}