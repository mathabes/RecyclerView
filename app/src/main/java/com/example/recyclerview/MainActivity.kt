package com.example.recyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        val adapter = PostagemAdapter()
        adapter.submitList(listaPostagem())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun listaPostagem(): List<Postagem>{
        return listOf(
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
            Postagem("", "", "matheus", "Foto do Thor"),
        )
    }
}
