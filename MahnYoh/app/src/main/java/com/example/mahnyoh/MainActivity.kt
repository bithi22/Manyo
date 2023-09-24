package com.example.mahnyoh

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mahnyoh.ui.theme.MahnYohTheme

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        var login = findViewById<Button>(R.id.login_button)
        val email = findViewById<EditText>(R.id.eMail)
        val password = findViewById<EditText>(R.id.passwords)
        login.setOnClickListener {
        val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
    }

    }
}


