package gautrin.fernando.cartelera

data class Pelicula (
    val id: Int,
    val titulo: String,
    val anio: Int,
    val duracion: Int,
    val genero: String,
    val director: String,
    val sinopsis: String,
    val imagen: Int
)

val peliculas = listOf<Pelicula>(
    Pelicula(
        1,
        "Interstellar",
        2014,
        189,
        "Ciencia Ficcion",
        "Christopher Nolan",
        "La película se basa en la teoría de la relatividad de Kip Stephen Thorne sobre los llamados agujeros de gusano. El físico teórico considera que estos fenómenos pueden utilizarse para llevar a cabo viajes en el tiempo. Un grupo de exploradores emprende un viaje a través de uno de ellos, una misión que los lleva a un universo desconocido y que se sale del entendimiento convencional. Cada uno de los tripulantes carga con su propia historia y conflictos emocionales, pero no hay lugar para flaquear en una misión que figura como la última esperanza para la humanidad.",
        R.drawable.r1
    ),
    Pelicula(
        2,
        "The Matrix",
        1999,
        136,
        "Ciencia Ficcion",
        "Lana Wachowski",
        "Final de milenio. Neo es un profesional de la informática que un día tiene la oportunidad de conocer a Morpheus, un mítico personaje para cualquier cibernauta que se precie. Él le puede introducir en un mundo inesperado, cuya existencia jamás se le ocurrió imaginar. Pero basta que Morpheus intente el contacto para que Neo empiece a sufrir una persecución implacable.",
        R.drawable.r2
    )
)
