package `in`.co.droidcon.android.adapter

import `in`.co.droidcon.android.R
import `in`.co.droidcon.db.Breed
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainViewHolder(itemView: View, breedClickListener: (Int) -> Unit) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView = itemView.findViewById<TextView>(R.id.breed_name_text_view)
    private val favoriteButton = itemView.findViewById<ImageButton>(R.id.favorite_button)

    init {
        favoriteButton.setOnClickListener { breedClickListener(adapterPosition) }
    }

    fun bindTo(breed: Breed) {
        nameTextView.text = breed.name
        if (breed.favorite == 0L) {
            favoriteButton.setBackgroundResource(R.drawable.ic_favorite_border_24px)
        } else {
            favoriteButton.setBackgroundResource(R.drawable.ic_favorite_24px)
        }
    }
}