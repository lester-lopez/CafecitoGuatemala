package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R

class t_a_nActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ta_nactivity)


        val bttan: Button = findViewById(R.id.t_a_n_button)
        bttan.setOnClickListener {
            val intent: Intent = Intent(this, HomeActivity:: class.java)
            onBackPressed()
        }

    }
}