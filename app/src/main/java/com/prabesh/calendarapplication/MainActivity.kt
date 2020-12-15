package com.prabesh.calendarapplication

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var btncalendar:Button
    private lateinit var btndob : Button
    private lateinit var btnoutput : Button
    private lateinit var tvwyear : TextView
    private lateinit var tvage : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncalendar = findViewById(R.id.btncalendar)
        btndob = findViewById(R.id.btndob)
        btnoutput=findViewById(R.id.btnoutput)
        tvwyear=findViewById(R.id.tvwyear)
        tvage=findViewById(R.id.tvage)

        btncalendar.setOnClickListener{
            loadCalender()
        }
        btndob.setOnClickListener{
            loaddob()
        }

    }
    private fun loadCalender(){
        val c = Calendar.getInstance()
        val year1 = c.get(Calendar.YEAR)
        val month1 = c.get(Calendar.MONTH)
        val day1 = c.get(Calendar.DATE)

        val datePickerDialog=DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { view, year, month, day ->
            btncalendar.text = "$year/$month/$day"
            tvwyear.text = " ${year1-year}-${month1-(month)}"

        },
                year1,
                month1,
                day1

        )
        datePickerDialog.show()
    }
    private fun loaddob(){
        val c = Calendar.getInstance()
        val year1 = c.get(Calendar.YEAR)
        val month1 = c. get(Calendar.MONTH)
        val day1 = c.get(Calendar.DATE)

        val datePickerDialog=DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { view, year, month, day ->
            btndob.setText("$year:$month:$day")
            tvage.setText("${year1-year}-${month1-(month)}")

        },
                year1,
                month1,
                day1

        )
        datePickerDialog.show()
    }

}