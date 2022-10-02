package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R

class t_f_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tf)



        val btntfmm: Button = findViewById(R.id.menu_t_f_button)
        btntfmm.setOnClickListener {
            val intent: Intent = Intent(this, HomeActivity:: class.java)
            onBackPressed()
        }
    }
}