package com.example.zuriproject2_funfact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.zuriproject2_funfact.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding : ActivityDetailBinding? = null
    private var logo: Int ? = 0
    private var name :String ? = ""
    private var detail : String ? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(LayoutInflater.from(this))
        setContentView(binding?.root)
        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAS,0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAS)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAS)
        setUpFactDetail()
    }
    private fun setUpFactDetail(){
        binding?.detailTv?.text = detail
        logo?.let { binding?.logoIv?.setImageResource(it) }
        title = name
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}