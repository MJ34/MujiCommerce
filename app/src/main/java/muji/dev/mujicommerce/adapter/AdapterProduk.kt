package muji.dev.mujicommerce.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import muji.dev.mujicommerce.R
import muji.dev.mujicommerce.model.Produk

class AdapterProduk(/*var activity: ArrayList<Produk>, */var data: ArrayList<Produk>) : RecyclerView.Adapter<AdapterProduk.Holder>() {

    class Holder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNama = view.findViewById<TextView>(R.id.tv_nama)
        val tvHarga = view.findViewById<TextView>(R.id.tv_harga)
       /* val tvHargaAsli = view.findViewById<TextView>(R.id.tv_hargaAsli)*/
        val imgProduk = view.findViewById<ImageView>(R.id.img_produk)
        val layout = view.findViewById<CardView>(R.id.layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.tvNama.text = data[position].nama
        holder.tvHarga.text = data[position].harga
        holder.imgProduk.setImageResource(data[position].gambar)
       /* val a = data[position]

        val hargaAsli = Integer.valueOf(a.harga)
        var harga = Integer.valueOf(a.harga)

        if (a.discount != 0) {
            harga -= a.discount
        }

        holder.tvHargaAsli.text = Helper().gantiRupiah(hargaAsli)
        holder.tvHargaAsli.paintFlags = holder.tvHargaAsli.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        holder.tvNama.text = data[position].name
        holder.tvHarga.text = Helper().gantiRupiah(harga)
        val image = Config.productUrl + data[position].image
        Picasso.get()
            .load(image)
            .placeholder(R.drawable.product)
            .error(R.drawable.product)
            .into(holder.imgProduk)

        holder.layout.setOnClickListener {
            val activiti = Intent(activity, DetailProdukActivity::class.java)
            val str = Gson().toJson(data[position], Produk::class.java)
            activiti.putExtra("extra", str)
            activity.startActivity(activiti)
        }*/
    }

    override fun getItemCount(): Int {
        return data.size
    }
}