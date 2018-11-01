package com.lidicebarrera.recycleviewexample

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    val fruitsItems: ArrayList<String> = ArrayList()   //crea objeto q se llama fruits Items de clase ArrayList
    val names= arrayListOf<String>("Cherry","Strawberry","Grapes","Mango","Apple","Orange","Pear","Pineapple","Bannana","Watermelon")
    val images=arrayListOf<Int>(R.drawable.cherry,R.drawable.strawberry,R.drawable.grapes,R.drawable.mango,R.drawable.apple,
                        R.drawable.orange,R.drawable.pear,R.drawable.pineapple,R.drawable.bannana,R.drawable.watermelon)
    //images es Int porque el nombre de cada fruta nos regresa un entero Int
    //Los nombres de las listas tanto del string como del Int deben de ser los mismos porque se van acomodando comforme un arreglo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addfruits()  //se manda a llamar y ya esta declarada abajo
        rvFruits.adapter=AdapterFruits(fruitsItems,this)  //siempre se le asigna el adaptador al recycler view
        rvFruits.layoutManager=LinearLayoutManager(this)  //en el linear layout manager se asigna la distribucion de lo q se va a mostrar

    }  //end of OnCreate

    private fun addfruits() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        fruitsItems.add("Lemon")
        fruitsItems.add("Banana")
        fruitsItems.add("Orange")
        fruitsItems.add("Pineapple")
        fruitsItems.add("Strawberry")
        fruitsItems.add("Apple")
        fruitsItems.add("Peach")
        fruitsItems.add("Mango")
        fruitsItems.add("Kiwi")
        fruitsItems.add("Melon")
    }
}
