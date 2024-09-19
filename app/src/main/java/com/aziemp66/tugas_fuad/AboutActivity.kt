package com.aziemp66.tugas_fuad

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
  private lateinit var mainMenuButton: Button

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_about)

    initalizeComponent()

    val lutsTextView = findViewById<TextView>(R.id.luts_text)
    var text = lutsTextView.text.toString()
    var spannableString = SpannableString(text)

    var start = text.indexOf("Lower urinary tract symptoms (LUTS)")
    var end = start + "Lower urinary tract symptoms (LUTS)".length


    spannableString.setSpan(
      StyleSpan(Typeface.BOLD),
      start,
      end,
      Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )

    lutsTextView.text = spannableString

    val bphTextView = findViewById<TextView>(R.id.bph_text)
    text = bphTextView.text.toString()
    spannableString = SpannableString(text)

    start = text.indexOf("Benign Prostate Hyperplasia (BPH)")
    end = start + "Benign Prostate Hyperplasia (BPH)".length

    spannableString.setSpan(
      StyleSpan(Typeface.BOLD),
      start,
      end,
      Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )

    bphTextView.text = spannableString
  }

  private fun initalizeComponent(): Unit {
    mainMenuButton = findViewById(R.id.about_menu)

    mainMenuButton.setOnClickListener {
      val intent = Intent(this, MainActivity::class.java)

      startActivity(intent)
    }
  }
}