package ddwu.com.mobile.anylearn2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainPageAdapter (private val menuItems: List<MenuItem>) : RecyclerView.Adapter<MainPageAdapter.MainPageViewHolder>() {

    class MainPageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val button1: Button = itemView.findViewById(R.id.MainPageButton1)
        val button2: Button = itemView.findViewById(R.id.MainPageButton2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainPageViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.main_page_menu_layout, parent, false)
        return MainPageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MainPageViewHolder, position: Int) {
        val currentItem = menuItems[position]

        holder.titleTextView.text = currentItem.title
        holder.descriptionTextView.text = currentItem.description

        if (currentItem.button1Text != " ") {
            holder.button1.text = currentItem.button1Text
            // Set onClickListener for button1 if needed
            // holder.button1.setOnClickListener { /* Your implementation here */ }
        } else {
            holder.button1.visibility = View.GONE
            holder.button1.isEnabled = false
        }

        holder.button2.text = currentItem.button2Text
        // Set onClickListener for button2 if needed
        // holder.button2.setOnClickListener { /* Your implementation here */ }
    }

    override fun getItemCount() = menuItems.size

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    private var itemClickListener: OnItemClickListener? = null


    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.itemClickListener = listener
    }
}

data class MenuItem(
    val title: String,
    val description: String,
    val button1Text: String,
    val button2Text: String
)