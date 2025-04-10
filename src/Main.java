//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos(a) a Screen Match!");
        System.out.println("Pelicua: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0)/3;
        System.out.println(media);

        String sinopsis = """
                Matrix es un paradoja
                La mejor pelicula  del fin del milenio
                Fué lanzado en:
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int)(media/2);
        System.out.println(clasificacion);



        // Mas formatos de texto

        String nombre1 = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre1, edad, valor));

        String nombre = "Juan";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre, aulas);

        System.out.println(mensaje);

        //Casting
        int a = 10;
        double b = a; // casting implícito

        double x = 10.5;
        int y = (int) x; // casting explícito
    }
}