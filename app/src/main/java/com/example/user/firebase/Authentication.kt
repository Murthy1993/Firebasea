package com.example.user.firebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.user.firebase.R.id.signin
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_authentication.*

class Authentication : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        signin.setOnClickListener {
            var auth = FirebaseAuth.getInstance()
            auth.signInWithEmailAndPassword(
                et1.text.toString(),
                et2.text.toString()
            ).addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(this@Authentication,
                        "Auth success",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@Authentication,
                        "Auth fail",Toast.LENGTH_LONG).show()

                }
            }
        }

        signUp.setOnClickListener {
            var auth = FirebaseAuth.getInstance()
            auth.createUserWithEmailAndPassword(
                et1.text.toString(),
                et2.text.toString()
            ).addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(this@Authentication,
                        "Auth success",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@Authentication,
                        "Auth fail",Toast.LENGTH_LONG).show()

                }
            }
        }

    }
}
