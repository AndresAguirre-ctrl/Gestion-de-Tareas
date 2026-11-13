public class Tarea {


    /*
    TODA LA DOCUMENTACIÓN DEBE APARECER AQUI
     */

    //ATRIBUTOS
    private String nombre;
    private String asignatura;
    private boolean completada;
<<<<<<< HEAD

=======
    //CONSTRUCTOR
>>>>>>> 3af73b6 (V0.1 Clase tarea hecha)
    public Tarea(String nombre, String asignatura){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.completada = false;
    }

<<<<<<< HEAD
=======
    // METODO: cambia el estado de la tarea
>>>>>>> 3af73b6 (V0.1 Clase tarea hecha)
    public void CompletarTarea(){
        completada = true;
    }

<<<<<<< HEAD
=======
    // METODO: muestra información
>>>>>>> 3af73b6 (V0.1 Clase tarea hecha)
    public void MostrarTarea(){
        System.out.println(nombre + " - " + asignatura);
    }
}
