/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        int opc;
        while (bandera) {
            System.out.print("Menu de Opciones\n"
                    + "1.-Ingresar Trabajador\n2.-Salir\n");
            opc = entrada.nextInt();
            if (opc == 1) {
                entrada.nextLine();
                Enlace c = new Enlace();
                System.out.println("Ingrese el numero de cedula del Trabajador");
                String cedula = entrada.nextLine();
                System.out.println("Ingrese el nombre del Trabajador");
                String nom = entrada.nextLine();
                System.out.println("Ingrese el correo del Trabajador");
                String corr = entrada.nextLine();
                System.out.println("Ingrese el sueldo del Trabajador");
                double sueld = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese el mes del sueldo del Trabajador");
                String mesSuel = entrada.nextLine();
                Trabajador tra
                        = new Trabajador(cedula, nom, corr, sueld, mesSuel);
                c.insertarCiudad(tra);
            } else {
                if (opc == 2) {
                    bandera = false;
                } else {
                    System.out.println("Valor fuera del rango");
                }
            }
        }
    }

}
