package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Aplikasi berjalan",Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.nama)

        tombol.setOnClickListener {
            Toast.makeText(this,"Adelia eka rahma wati",Toast.LENGTH_SHORT).show()

            val tombol1  =findViewById<Button>(R.id.kelas)

            tombol1.setOnClickListener {
                Toast.makeText(this,"XI PPLG 1",Toast.LENGTH_SHORT).show()

                val tombol2 =findViewById<Button>(R.id.NIS)
                tombol2.setOnClickListener {
                    Toast.makeText(this,"2233242",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}