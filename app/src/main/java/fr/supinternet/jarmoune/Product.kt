package fr.supinternet.jarmoune

data class Product(
    val name: String,
    val brand: String,
    val barcode: String,
    val nutriscore: String,
    val novascore: Int,
    val isVegetarian: Boolean,
    val isVegetalian: Boolean,
    val imageUrl: String,
    val quantity: String,
    val countries: List<String>,
    val ingredients: List<String>,
    val allergens: List<String>,
    val additives: List<String>
)

fun generateFakeProduct() = Product(
    name = "Petits pois et carottes",
    brand = "Cassegrain",
    barcode = "3083680085304",
    nutriscore = "A",
    novascore = 3,
    isVegetarian = false,
    isVegetalian = true,
    imageUrl = "https://static.openfoodfacts.org/images/products/308/368/008/5304/front_fr.7.400.jpg",
    quantity = "400 g",
    countries = listOf("France", "Suisse", "Japon"),
    ingredients = listOf(
        "Petits pois 66%",
        "eau",
        "garniture 2,8% (salade, oignon grelot)",
        "sucre",
        "sel",
        "arôme naturel"

    ),
    allergens = emptyList(),
    additives = emptyList()
)