package lrlp.example.cafecito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cafecito.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_auth_login.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.logOutButton as logOutButton1

enum class ProviderType{
    BASIC
}

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sal1: Button = findViewById(R.id.bsalirapp)
            sal1.setOnClickListener {
            val intent: Intent = Intent("")
                finishAffinity()
        }

        //---------------------------------------------------
        val btninf: Button = findViewById(R.id.informacion_button2)
        btninf.setOnClickListener {
            val intent: Intent = Intent(this, informacion_Activity:: class.java)
            startActivity(intent)

        }
        //---------------------------------------------------
        val btnantq: Button = findViewById(R.id.t_a_q1button3)
        btnantq.setOnClickListener {
            val intent: Intent = Intent(this, t_a_qActivity:: class.java)
            startActivity(intent)


        }
        //---------------------------------------------------
        val btnant: Button = findViewById(R.id.t_a_n1_button)
        btnant.setOnClickListener {
            val intent: Intent = Intent(this, t_a_nActivity:: class.java)
            startActivity(intent)

        }
        //---------------------------------------------------
        val btnte: Button = findViewById(R.id.t_e_button)
        btnte.setOnClickListener {
            val intent: Intent = Intent(this, frases2t_eActivity:: class.java)
            startActivity(intent)


        }
        //para navegar entre activity
        val btn: Button = findViewById(R.id.t_cafe)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, frases1t_cActivity:: class.java)
            startActivity(intent)

        }
        //--------------------------------------------------
        val btntf111: Button = findViewById(R.id.t_f111_button)
        btntf111.setOnClickListener {
            val intent: Intent = Intent(this, t_f_Activity:: class.java)
            startActivity(intent)

        }
        //--------------------------------------------------


        //--------------------------------------------------

        //setup
        //para recuperar los parametros
        val bundle:Bundle? = intent.extras
        val email :String? =bundle?.getString("email")
        val provider :String? =bundle?.getString("provider")
        setup(email?:"", provider?:"")
    }
    //jalamos la infromacion de home
    private fun setup(email:String, provider: String){
        title="Inicio"
        //para que se acualice con el email
        emailtextView.text =email

        //mandamos a llamar el boton  de cerrar sesion
        logOutButton.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
            //on back press para volver a la pantalla principal
        }

    }
}