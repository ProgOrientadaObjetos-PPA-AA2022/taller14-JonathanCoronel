/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author SALAI
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private double cal1;
    private double cal2;
    private double cal3;
    private double promedio;

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerCal1(double cl1) {
        cal1 = cl1;
    }

    public void establecerCal2(double cl2) {
        cal2 = cl2;
    }

    public void establecerCal3(double cl3) {
        cal3 = cl3;
    }

    public void calcularPromedio() {
        promedio = (cal1 + cal2 + cal3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public double obtenerCal3() {
        return cal3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n  Calificaciones:\n  %.1f"
                + "\n  %.1f\n  %.1f\n  Promedio: %.1f\n",
                nombre, apellido, cal1, cal2, cal3, promedio);
        return cadena;
    }

}
