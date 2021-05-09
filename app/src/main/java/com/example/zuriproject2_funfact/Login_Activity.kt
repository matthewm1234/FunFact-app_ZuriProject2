package com.example.zuriproject2_funfact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.zuriproject2_funfact.databinding.ActivityLoginBinding
import com.example.zuriproject2_funfact.databinding.ActivityMainBinding

class Login_Activity : AppCompatActivity() {
    var binding: ActivityLoginBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)
        binding?.loginButton?.setOnClickListener {
            if (binding?.userName?.text.isNullOrEmpty() || binding?.password?.text.isNullOrEmpty())
                Toast.makeText(this, "All Fields must be entered, non should be empty", Toast.LENGTH_SHORT).show()
            else if (binding?.userName?.text.toString() == "matthew" && binding?.password?.text.toString() == "mypassword") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username Must be : \"matthew\" and password : \"mypassword\"", Toast.LENGTH_SHORT).show()
            }

        }
    }
}