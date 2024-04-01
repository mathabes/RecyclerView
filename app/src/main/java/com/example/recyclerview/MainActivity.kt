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
        adapter.onClick = {
            println(it)
        }

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun listaPostagem(): List<Postagem>{
        return listOf(
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
            Postagem("https://upload.wikimedia.org/wikipedia/commons/c/ce/X_logo_2023.svg", "https://t.ctcdn.com.br/Ym9t_1dCfwc9uIknM54YCC4phg8=/i489927.jpeg", "matheus", "Foto do Thor"),
        )
    }
}
