
/**
 * Write a description of class Asignatura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asignatura
{
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Asignatura(String codigo, String nombre, Profesor profesor){
    this.codigo=codigo;
    this.nombre=nombre;
    this.profesor=profesor;
    }
}
