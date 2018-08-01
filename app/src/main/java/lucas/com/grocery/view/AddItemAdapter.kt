package lucas.com.grocery.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.add_item_adapter.view.*
import lucas.com.grocery.R
import lucas.com.grocery.model.Product

class AddItemAdapter(
        val items: List<Product>,
        val context: Context)
    : RecyclerView.Adapter<AddItemAdapter.AddItemViewHolder>() {

    class AddItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivIcon: ImageView = view.iv_product
        val tvTitle: TextView = view.tv_descr
        val up: ImageView = view.button_plus
        val down: ImageView = view.button_minus
        val count: TextView = view.count
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): AddItemViewHolder {
        return AddItemViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.add_item_adapter, parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: AddItemViewHolder, index: Int) {
        val item = items[index]
        holder.ivIcon.setImageResource(item.image)
        holder.tvTitle.text = item.name
        var count = 0
        holder.up.setOnClickListener {
            count = count + 1
            holder.count.text = (count).toString()
        }
        holder.down.setOnClickListener {
            if (count > 0) { count = count - 1 }
            holder.count.text = (count).toString()
        }
    }
}