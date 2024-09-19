package com.aziemp66.tugas_fuad

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PhysicalActivity : AppCompatActivity() {
  private lateinit var mainMenuButton: Button
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_physical)

    initializeComponent()

    val tableLayout: TableLayout = findViewById(R.id.table_layout)

    // Add Storage Symptoms
    addCategoryToTable(tableLayout, R.array.physical_dre_bph_findings, "BPH")

    // Add Voiding Symptoms
    addCategoryToTable(
      tableLayout,
      R.array.physical_dre_prostate_carcinoma_finding,
      "Prostate Carcinoma"
    )

  }

  private fun addCategoryToTable(tableLayout: TableLayout, arrayResId: Int, categoryTitle: String) {
    val inflater = LayoutInflater.from(this)

    // Add category title
    val titleRow: TableRow =
      inflater.inflate(R.layout.table_row_title, tableLayout, false) as TableRow
    val titleTextView: TextView = titleRow.findViewById(R.id.row_title)
    titleTextView.text = categoryTitle
    tableLayout.addView(titleRow)

    // Add symptoms
    val symptoms = resources.getStringArray(arrayResId)
    for (symptom in symptoms) {
      val symptomRow: TableRow =
        inflater.inflate(R.layout.table_row_symptom, tableLayout, false) as TableRow
      val symptomTextView: TextView = symptomRow.findViewById(R.id.row_symptom)
      symptomTextView.text = symptom
      tableLayout.addView(symptomRow)
    }
  }

  private fun initializeComponent(): Unit {
    mainMenuButton = findViewById(R.id.physical_menu)

    mainMenuButton.setOnClickListener {
      val intent = Intent(this, MainActivity::class.java)

      startActivity(intent)
    }
  }
}