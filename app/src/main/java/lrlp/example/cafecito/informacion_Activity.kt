package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R

class informacion_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        //---------------------------------------------------
        val btninfom: Button = findViewById(R.id.m_info_button)
        btninfom.setOnClickListener {
            val intent: Intent = Intent(this, HomeActivity:: class.java)
            onBackPressed()
        }

    }
}