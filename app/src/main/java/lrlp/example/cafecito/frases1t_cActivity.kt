package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R

class frases1t_cActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frases1t_cactivity)

        val btnftc: Button = findViewById(R.id.f3_t_c_button3)
        btnftc.setOnClickListener {
            val intent: Intent = Intent(this, t_cafe_Activity3:: class.java)
            startActivity(intent)
            finish()
        }

    }
}