package fr.supinternet.jarmoune

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_products_list.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_details_summary)
        setContentView(R.layout.fragment_products_list)
        supportActionBar?.let {
            it.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this@MainActivity, android.R.color.transparent)))
            it.title = ""
        }
        //val product = generateFakeProduct()
        //myquantity.value.text = product.quantity

        // TODO Créez des faux objets Product dans cette liste
        val products = listOf(generateFakeProduct(), generateFakeProduct(), generateFakeProduct())

        // On initialise la RecyclerView on lui indiquant que l'on souhaite afficher la liste de produits
            products_list.layoutManager = LinearLayoutManager(this)
            products_list.adapter = ProductsListAdapter(products, object : ProductsListAdapter.OnProductItemClicked {
                override fun onProductClicked(product: Product) {
                    // TODO L'utilisateur a cliqué sur le produit reçu en paramètre
                    // Ouvrir l'écran de détails
                }
            })
        }

}