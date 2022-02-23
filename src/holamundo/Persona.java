package holamundo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marely Medina
 */
public class Persona {
    private String nombre;
    private int edad;
    
    //metodo contructor
    public Persona() {
    }
    
    // metodo constructor sobrecrgado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //metodos de uso general

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     public void comer( String platillo ){
        System.out.println( this.nombre + " está comiendo " + platillo );
    
    }
}
