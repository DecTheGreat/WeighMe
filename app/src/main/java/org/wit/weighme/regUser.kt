package org.wit.weighme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.reg_user.*
import java.util.*

class regUser : AppCompatActivity() {
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        setContentView(R.layout.reg_user)

        reg_button.setOnClickListener(){

            val name: String = user_name.text.toString()
            val age: Int = user_age.text.toString().toInt()
            val targetWeight: Double = target_weight.text.toString().toDouble()
            val members = ArrayList<User>()


            if(name== null || age== null || targetWeight== null) {
                Toast.makeText(this, "you must fill out all fields before registering",Toast.LENGTH_SHORT).show()
            }
            else{

                val newUser = User(name,age,targetWeight)
                members.add(newUser)
                val intent = Intent(this, MainActivity::class.java)

            }
        }
    }

}
