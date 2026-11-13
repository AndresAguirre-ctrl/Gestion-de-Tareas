public class Tarea {

    private String nombre;
    private String asignatura;
    private boolean completada;

    public Tarea(String nombre, String asignatura){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.completada = false;
    }

    public void CompletarTarea(){
        completada = true;
    }

    public void MostrarTarea(){
        System.out.println(nombre + " - " + asignatura);
    }
}
