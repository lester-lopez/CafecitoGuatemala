package lrlp.example.cafecito

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.cafecito.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_auth_login.*

class Authlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth_login)


        //funcion
        setup()
    }
    //funcion boton atras
    override fun onBackPressed() {
        super.onBackPressed()
        //codigo adicional
        finish()
    }

    private fun setup() {
        //cambio de nombre de la pantalla
        title = "Autenticación"
        //va a optener la informacion del usuario al hacer el click
        logOutButton.setOnClickListener {
            //el isnotempty es para verificar que no es basio
            if (emailEditText.text.isNotEmpty() && passwordeditText.text.isNotEmpty()){
                //accedemos a firebase
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(emailEditText.text.toString(),
                    passwordeditText.text.toString()).addOnCompleteListener {
                                                    //addoncomples es para notificar si la operacion de
                                                    // resgitro a sido satisfactoria o no.
                    //para confirmar si la operacion se completo correctamente
                if (it.isSuccessful){ //los? son codiciones por si a caso que no exite un email se envie basio
                        showHome(it.result?.user?.email?:"", ProviderType.BASIC)
                    }else{
                        //de esta manera llammos la funcion de alerta
                        //creamos una nueva para movernos a las sienguiente ventana
                    showAlert()
                    //toda la logica del boton registrar
                 }
              }
            }
        }
        loginButton.setOnClickListener {
            //el isnotempty es para verificar que no es basio
            if (emailEditText.text.isNotEmpty() && passwordeditText.text.isNotEmpty()){
                //accedemos a firebase
                FirebaseAuth.getInstance().signInWithEmailAndPassword(emailEditText.text.toString(),
                    passwordeditText.text.toString()).addOnCompleteListener {
                    //addoncomples es para notificar si la operacion de
                    // resgitro a sido satisfactoria o no.
                    //para confirmar si la operacion se completo correctamente
                    if (it.isSuccessful){ //los? son codiciones por si a caso que no exite un email se envie basio
                        showHome(it.result?.user?.email?:"", ProviderType.BASIC)
                    }else{
                        //de esta manera llammos la funcion de alerta
                        //creamos una nueva para movernos a las sienguiente ventana
                        showAlert()
                        //toda la logica del boton acceder
                    }
                }
            }
        }
    }
        //para el error creamos la siguiente funcion
        private fun showAlert(){
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Error")
            builder.setMessage("Se ha producido un ERROR de autenticación. " +
                    "Si el usuario no está registrado por favor Presioné Registrar, " +
                    "si el problema persiste revise su conexión a INTERNET.Se ha producido " +
                    "un ERROR de autenticación. Si el usuario no está registrado" +
                    " por favor Presioné Registrar, si el problema persiste revise su conexión a INTERNET.")
            builder.setPositiveButton("Aceptar",null)
            val dialog: AlertDialog=builder.create()
            dialog.show()
    }
    private fun showHome(email:String,provider: ProviderType){
        //accion para moverse de ventana
        val homeIntent =Intent(this, HomeActivity::class.java).apply {
            //vamos a pasarle los datos que es email y el proveedor
            putExtra("email",email)
            putExtra("provider", provider.name)
        }
        //navegamos a la siguiente pantalla
        startActivity(homeIntent)
    }

}