package com.elsa.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yurifa.recyclerviewyurifa.R

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.sphr,
                nameSuperhero = "sphr",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.sphr1,
                nameSuperhero = "sphr1",
                descSuperhero = "hebat hebat hebat"
        ),
            Superhero(
                R.drawable.sphr2,
                nameSuperhero = "sphr2",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.sphr3,
                nameSuperhero = "sphr3",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.sphr4,
                nameSuperhero = "sphr4",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.sphr5,
                nameSuperhero = "sphr5",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.sphr6,
                nameSuperhero = "sphr6",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.superhero1,
                nameSuperhero = "superhero1",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.superhero2,
                nameSuperhero = "superhero2",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.superhero3,
                nameSuperhero = "superhero3",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.superhero4,
                nameSuperhero = "superhero4",
                descSuperhero = "hebat hebat hebat"
            ),
            Superhero(
                R.drawable.superman,
                nameSuperhero = "superman",
                descSuperhero = "hebat hebat hebat"
            )

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter (this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}