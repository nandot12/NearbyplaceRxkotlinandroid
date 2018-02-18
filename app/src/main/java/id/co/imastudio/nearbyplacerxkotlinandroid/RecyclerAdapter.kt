package id.co.imastudio.nearbyplacerxkotlinandroid

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.co.imastudio.nearbyplacerxkotlinandroid.model.ResultsItem
import kotlinx.android.synthetic.main.recyclerview_item.view.*

/**
 * Created by nandoseptianhusni on 2/17/18.
 */
class RecyclerAdapter(data : List<ResultsItem>) : RecyclerView.Adapter<RecyclerAdapter.MyHolder>() {

   lateinit var ambildata :List<ResultsItem>
    init {
        ambildata = data
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyHolder {

        var view = LayoutInflater.
                from(parent?.context).inflate(R.layout
                .recyclerview_item,parent,false)

        return MyHolder(view)

    }

    override fun getItemCount(): Int {

        return ambildata.count()
    }

    override fun onBindViewHolder(holder: MyHolder?, position: Int) {

        holder?.bind(ambildata.get(position))

    }

    class MyHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bind(ambildata: ResultsItem) {
            itemView.textName.text = ambildata.name
            itemView.textAlamat.text = ambildata.vicinity
            itemView.ratting.rating = ambildata.rating?.toFloat()!!
        }

    }
}