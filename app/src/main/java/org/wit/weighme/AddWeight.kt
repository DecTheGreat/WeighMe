package org.wit.weighme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_weight.*
import java.text.DateFormat
import java.text.DateFormat.getDateInstance
import java.time.LocalDate
import java.util.*


class AddWeight: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_weight)

        new_weight_date.text =  DateFormat.getDateInstance().toString()
        val cweight =  new_weight.text.toString().toDouble()


        val history = ArrayList<Weight>()



        save_button.setOnClickListener {
            if (cweight != null) {

                val x = Weight(cweight)
                history.add(x)

            }

        }
    }
}