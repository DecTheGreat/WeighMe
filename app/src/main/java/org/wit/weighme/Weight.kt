package org.wit.weighme

import android.os.Build
import android.support.annotation.RequiresApi
import java.time.LocalDate


class Weight(val cwieght: Double){

    @RequiresApi(Build.VERSION_CODES.O)

    val date = LocalDate.now()

}