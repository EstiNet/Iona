package net.estinet.iona.setup

import android.content.Intent
import net.estinet.iona.systemDirectory

object SetupProcess {
    //After the setup process is called.
    fun checkSetupPart(part: String){
        val intent = Intent(net.estinet.iona.appCompatActivity, SetupView::class.java)
        var appCompat = net.estinet.iona.appCompatActivity
        appCompat!!.startActivity(intent)
        println("Initialized activity NameView")
        //Do something with part
    }

    fun startSetupProcess(){
        systemDirectory.deleteRecursively()
    }
}
