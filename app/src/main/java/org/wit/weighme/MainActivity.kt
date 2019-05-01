package org.wit.weighme

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.content.Intent
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.wit.weighme.AddWeight as WeighmeAddWeight


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.add)
        val history = findViewById<Button>(R.id.history)


        home.setOnClickListener{

        }

        history.setOnClickListener{
            val intent = Intent (this, DisplayWeight::class.java)
            startActivity(intent)
        }

        add.setOnClickListener{
            val intent= Intent(this, org.wit.weighme.AddWeight::class.java)
            startActivity(intent)

        }

        regButton.setOnClickListener {
            val intent= Intent(this,regUser::class.java)
            startActivity(intent)
        }
    }
}
