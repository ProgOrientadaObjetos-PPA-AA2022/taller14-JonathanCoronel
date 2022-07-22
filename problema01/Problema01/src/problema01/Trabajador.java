/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author SALAI
 */
public class Trabajador {

    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;

    public Trabajador(String ced, String nom, String cor,
            double sue, String mesSu) {
        cedula = ced;
        nombres = nom;
        correo = cor;
        sueldo = sue;
        mesSueldo = mesSu;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerNombres(String nom) {
        nombres = nom;
    }

    public void establecerCorreo(String co) {
        correo = co;
    }

    public void establecerSueldo(double sue) {
        sueldo = sue;
    }

    public void establecerMesSueldo(String mesSue) {
        mesSueldo = mesSue;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }

}
