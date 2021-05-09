package com.example.zuriproject2_funfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.zuriproject2_funfact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding? = null
    private var adapter : FactAdapter ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)
        setUpFact()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun setUpFact() {
        adapter = FactAdapter(this, DummyData.funFacts)
      binding?.factListView?.adapter = adapter
    }
}