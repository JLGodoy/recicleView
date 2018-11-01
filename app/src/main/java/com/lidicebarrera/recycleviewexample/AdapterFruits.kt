package com.lidicebarrera.recycleviewexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fruits_list.view.*
import java.security.AccessControlContext

class AdapterFruits (val items:ArrayList<String>,val context: Context ):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.   //todos son metodos
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.fruits_list,p0,false))
    }

    override fun getItemCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return itemCount //regresa el numero d elementos en la lista
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder?, p1: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
       // ---p0?.tvFruitsType?.text=items.get(p1)
    }  //le pasamos dos valores a la clase, un arreglo y el contexto de la app

} //end of class adapter

class ViewHolder (view:View):RecyclerView.ViewHolder(view){
    //Holds the TextView  that will add each animal to
    val tvFruitsType=view.tvFruits
}