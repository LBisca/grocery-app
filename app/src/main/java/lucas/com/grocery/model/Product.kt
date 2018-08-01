package lucas.com.grocery.model

import lucas.com.grocery.R

data class Product(
        val name: String,
        val image: Int
)

fun getList(): List<Product> {
    val avaibleList = mutableListOf<Product>(
            Product("Leite", (R.drawable.milk)),
            Product("Papel Toalha", (R.drawable.paperroll)),
            Product("Papel Higiênico", (R.drawable.toiletpaper)),
            Product("Sabonete", (R.drawable.sabao)),
            Product("Farinha", (R.drawable.farinha))
    )

    return avaibleList
}