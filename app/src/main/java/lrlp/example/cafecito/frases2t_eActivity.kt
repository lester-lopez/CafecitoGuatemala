package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R

class frases2t_eActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frases2t_eactivity)

        val btnfte: Button = findViewById(R.id.f2_t_e_button4)
        btnfte.setOnClickListener {
            val intent: Intent = Intent(this, t_e_Activity:: class.java)
            startActivity(intent)
            finish()
        }

    }
}