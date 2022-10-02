package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R

class t_a_qActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ta_qactivity)


        val bttanq: Button = findViewById(R.id.m_t_a_q1button)
        bttanq.setOnClickListener {
            val intent: Intent = Intent(this, HomeActivity:: class.java)

            onBackPressed()
        }
    }
}