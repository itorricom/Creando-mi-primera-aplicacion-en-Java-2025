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
    }
}