/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface01;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private int registro;
    
   

    public Alumno() {
        this.nombre = "nombre";
        this.apellido = "apellidos";
        this.registro = 1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getRegistro() {
        return registro;
    }
    
    
}
