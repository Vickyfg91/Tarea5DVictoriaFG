/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author vickyfg
 */
public class Animales {
    String nombre;
    String raza;
    int edad;
    String nombreDueño;

    //Constructor parametrizado
    public Animales(String nombre, String raza, int edad, String nombreDueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.nombreDueño = nombreDueño;
    }

    //Contructor sin parametros
    public Animales() {
    }
    
    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animales{");
        sb.append("nombre=").append(nombre);
        sb.append(", raza=").append(raza);
        sb.append(", edad=").append(edad);
        sb.append(", nombreDue\u00f1o=").append(nombreDueño);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
