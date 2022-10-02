package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.cafecito.R

class t_cafe_Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tcafe3)

        //para un texview con link
        val t = findViewById<View>(R.id.linkii) as TextView
        t.movementMethod = LinkMovementMethod.getInstance()

        val btntcm: Button = findViewById(R.id.menu_t_cafe_button)
        btntcm.setOnClickListener {
            val intent: Intent = Intent(this, HomeActivity:: class.java)
            onBackPressed()
        }


    }
}