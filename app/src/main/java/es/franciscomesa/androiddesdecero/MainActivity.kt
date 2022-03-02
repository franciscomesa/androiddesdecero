package es.franciscomesa.androiddesdecero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import es.franciscomesa.androiddesdecero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.message.text = "Hola mundo View Binding"

        // Classic way
        // val message = findViewById<TextView>(R.id.message)
        // message.text = "Hola mundo"

        Log.d("MainActivity", "onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MainActivity", "onDestroy")
    }
}