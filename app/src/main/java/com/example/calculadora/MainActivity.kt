package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSomar.setOnClickListener{somar()}
    }

    fun somar(){
        val n1 = (binding.edtN1.text).toString().toFloat()
        val n2 = (binding.edtN2.text).toString().toFloat()
        val res = n1+n2
        binding.txvResulado.text="%.2f".format(res)
    }
}