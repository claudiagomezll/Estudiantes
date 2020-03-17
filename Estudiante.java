
import java.util.*;
public class Estudiante
{
    String codigo;
    String nombre;
    String telefono;
    String email;
    String direccion;
    Integer edad;
    String documento;
    String tipodoc;
    Integer creditos;
    Integer semestre;
    String estado;
    Carrera carrera;

    public Estudiante()
    {
        this.codigo="0151803";
        this.nombre="Claudia Gómez";
        this.telefono="3112490070";
        this.email="claudiaygomez@ufps.edu.co";
        this.direccion="Av 17 Libertadores";
        this.edad=34;
        this.documento="37391391";
        this.tipodoc="cc";
        this.creditos=120;
        this.semestre=20;
        this.estado="Activo";
        this.carrera=new Carrera();
    }

    public Estudiante( String codigo, String nombre,String telefono,String email,String direccion,Integer edad,String documento,String tipodoc,Integer creditos,Integer semestre,
    String estado,Carrera carrera)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
        this.edad=edad;
        this.documento=documento;
        this.tipodoc=tipodoc;
        this.creditos=creditos;
        this.semestre=semestre;
        this.estado=estado;
        this.carrera=carrera;

    }

    public void  calcularMayorEdad()
    {
        if (getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else {
            System.out.println("El estudiante es menor de edad");}

    }

    public void cursoTotalCreditos()
    {
        if(getCreditos()>=carrera.getNumcreditos()){
            System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumcreditos());
            System.out.println("Estás a un paso de ser:   "+carrera.getTitulo());
        }
        else 
        {   System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumcreditos());
            System.out.println("El que persevera alcanza");}
    }

    public void matricularProyecto(){
        if(getCreditos()>=(carrera.getNumcreditos()*0.7)&&getSemestre()>=7)
        {
            System.out.println("Señor estudiante usted ya puede matricular proyecto de grado");}

        else
            System.out.println("No puedes matricular poryecto de grado te faltan creditos y semestres por cursar");
    }

    public void promedioCreditosSemestre(){
    
       Float promedio=(float)(getCreditos()/getSemestre());
        
        System.out.println("El promedio de creditos cursados es: " + promedio);
    
    }
    
    public void actualizarEstado(){
   
        if (getSemestre()>=carrera.getNumsem()*2)
        {
             this.estado ="PFU";
        }
        System.out.println("Los semestres cursados son: " + getSemestre());
        System.out.println("Los semestres cursados son: " +carrera.getNumsem());
    
    }
    
    /**Metodo de acceso a la propiedad codigo*/
    public String getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**Metodo de modificación a la propiedad codigo*/
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad telefono*/
    public String getTelefono(){
        return this.telefono;
    }//end method getTelefono

    /**Metodo de modificación a la propiedad telefono*/
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }//end method setTelefono

    /**Metodo de acceso a la propiedad email*/
    public String getEmail(){
        return this.email;
    }//end method getEmail

    /**Metodo de modificación a la propiedad email*/
    public void setEmail(String email){
        this.email = email;
    }//end method setEmail

    /**Metodo de acceso a la propiedad direccion*/
    public String getDireccion(){
        return this.direccion;
    }//end method getDireccion

    /**Metodo de modificación a la propiedad direccion*/
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }//end method setDireccion

    /**Metodo de acceso a la propiedad edad*/
    public Integer getEdad(){
        return this.edad;
    }//end method getEdad

    /**Metodo de modificación a la propiedad edad*/
    public void setEdad(Integer edad){
        this.edad = edad;
    }//end method setEdad

    /**Metodo de acceso a la propiedad documento*/
    public String getDocumento(){
        return this.documento;
    }//end method getDocumento

    /**Metodo de modificación a la propiedad documento*/
    public void setDocumento(String documento){
        this.documento = documento;
    }//end method setDocumento

    /**Metodo de acceso a la propiedad tipodoc*/
    public String getTipodoc(){
        return this.tipodoc;
    }//end method getTipodoc

    /**Metodo de modificación a la propiedad tipodoc*/
    public void setTipodoc(String tipodoc){
        this.tipodoc = tipodoc;
    }//end method setTipodoc

    /**Metodo de acceso a la propiedad creditos*/
    public Integer getCreditos(){
        return this.creditos;
    }//end method getCreditos

    /**Metodo de modificación a la propiedad creditos*/
    public void setCreditos(Integer creditos){
        this.creditos = creditos;
    }//end method setCreditos

    /**Metodo de acceso a la propiedad semestre*/
    public Integer getSemestre(){
        return this.semestre;
    }//end method getSemestre

    /**Metodo de modificación a la propiedad semestre*/
    public void setSemestre(Integer semestre){
        this.semestre = semestre;
    }//end method setSemestre

    /**Metodo de acceso a la propiedad estado*/
    public String getEstado(){
        return this.estado;
    }//end method getEstado

    /**Metodo de modificación a la propiedad estado*/
    public void setEstado(String estado){
        this.estado = estado;
    }//end method setEstado

    /**Metodo de acceso a la propiedad carrera*/
    public Carrera getCarrera(){
        return this.carrera;
    }//end method getCarrera

    /**Metodo de modificación a la propiedad carrera*/
    public void setCarrera(Carrera carrera){
        this.carrera = carrera;
    }//end method setCarrera

}