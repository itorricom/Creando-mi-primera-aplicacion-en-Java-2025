public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        /*if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicuas mas populares");
        }else {
            System.out.println("Pelicuas Retro que aun valen la pena ver");
        }*/

        if (incluidoEnElPlan || tipoPlan.equals("plus")) {
            System.out.println("Disfruta de sus pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }

    }
}
