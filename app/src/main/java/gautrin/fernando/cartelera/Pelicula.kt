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
    ),
    Pelicula(
        3,
        "The Backrooms",
        2026,
        105,
        "Terror psicológico",
        "Kane Parsons",
        "The Backrooms es una película de terror inspirada en el fenómeno viral de internet del mismo nombre. La historia gira en torno a un lugar misterioso formado por interminables pasillos y habitaciones amarillentas, aparentemente vacías, donde las leyes de la realidad parecen no funcionar. Cuando alguien termina atrapado allí, debe encontrar la manera de escapar mientras descubre que no está solo y que algo aterrador podría estar acechándolo. La película combina terror psicológico, suspenso y el miedo a lo desconocido, creando una atmósfera inquietante en la que perderse puede ser mucho más peligroso de lo que parece.",
        R.drawable.vhj4u8o1l6sg1
    ),
    Pelicula(
        4,
        "The Green Mile",
        1999,
        189,
        "Drama, fantasía y crimen",
        "Frank Darabont",
        "Ambientada en 1935, durante la Gran Depresión en Estados Unidos, la película sigue a Paul Edgecomb, un guardia de prisión encargado del corredor de la muerte, conocido como «La milla verde». Su vida cambia cuando llega John Coffey, un hombre de gran tamaño y carácter bondadoso que ha sido condenado por el asesinato de dos niñas. A medida que Paul conoce mejor a John, descubre que posee un extraordinario don sobrenatural que lo lleva a cuestionar su culpabilidad y todo lo que creía saber sobre la justicia, la vida y los milagros. La historia explora la compasión, la injusticia, la amistad y la humanidad.",
        R.drawable.images
    ),
    Pelicula(
        5,
        "Good Will Hunting",
        1997,
        126,
        "Drama psicológico y romance",
        "Gus Van Sant",
        "La película cuenta la historia de Will Hunting, un joven con una inteligencia extraordinaria y un talento excepcional para las matemáticas, que trabaja como conserje en el Instituto Tecnológico de Massachusetts (MIT). A pesar de su brillante mente, Will tiene dificultades para manejar sus emociones y construir relaciones personales debido a las experiencias dolorosas de su pasado. Cuando un profesor descubre su talento, Will comienza a recibir ayuda del psicólogo Sean Maguire, quien lo guía en un proceso de autoconocimiento que lo lleva a enfrentar sus miedos, superar sus inseguridades y descubrir qué quiere hacer con su vida. La historia aborda temas como la amistad, el amor, el trauma, el potencial humano y la importancia de aceptar ayuda.",
        R.drawable.image2s
    ),
    Pelicula(
        6,
        "2001: A Space Odyssey",
        1968,
        139,
        "Ciencia Ficcion",
        "Stanley Kubrick",
        "La película presenta un viaje por la evolución humana, desde los primeros homínidos hasta la exploración del espacio. La historia comienza cuando unos primates descubren un misterioso monolito negro que parece impulsar su inteligencia. Millones de años después, los científicos encuentran otro monolito en la Luna, cuya señal conduce a una misión espacial hacia Júpiter. Durante el viaje, los astronautas David Bowman y Frank Poole dependen de HAL 9000, una computadora con inteligencia artificial que controla la nave. Sin embargo, cuando HAL comienza a comportarse de manera extraña, la misión se convierte en una lucha por la supervivencia. La película explora temas como la evolución, la inteligencia artificial, el origen de la humanidad y los misterios del universo.",
        R.drawable.image334
    )
)
