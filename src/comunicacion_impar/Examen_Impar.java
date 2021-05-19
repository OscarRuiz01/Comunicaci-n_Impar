/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion_impar;

/**
 *
 * @author OscarRuiz
 */
public class Examen_Impar {
    private static String nombre;
    private static int cantidadUsuarios;
    private static Integer tiempo;
    private static String nivel;
    private static int estrellas;
    
    public Examen_Impar(String nombre, int cantidadUsuarios, int tiempo, String nivel, int estrella) {
        Examen_Impar.nombre = nombre;
        Examen_Impar.cantidadUsuarios = cantidadUsuarios;
        Examen_Impar.estrellas = estrellas;
        Examen_Impar.tiempo = tiempo;
        Examen_Impar.nivel = nivel;
    }
    public static int calidad () {
        return cantidadUsuarios*tiempo*estrellas;
    }
    public static void manin (String[] args) {
        Examen_Impar Examen_Impar = new Examen_Impar ("meet", 100, 400, "libre", 5);
        System.out.println("calidad()");
    }
}
