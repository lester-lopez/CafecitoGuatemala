package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R

class t_e_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_te)


        val btntem: Button = findViewById(R.id.menu_t_e_button)
        btntem.setOnClickListener {
            val intent: Intent = Intent(this, HomeActivity:: class.java)
            onBackPressed()
        }


    }
}