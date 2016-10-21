/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg19;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULAR SENO, COSENO Y TANGENTE A PARTIR DE UN ANGULO DADO
        double angulo, seno, coseno, tangente;
        angulo = solicitarAngulo();
        calculoResultados(angulo);
        
    }
    
    //ESCANEO DEL ANGULO INGRESADO POR EL USUARIO
    public static double solicitarAngulo(){
        double angulo;
        System.out.println("Ingresa el angulo que deseas evaluar:");
        Scanner entradaAngulo = new Scanner(System.in);
        angulo = entradaAngulo.nextDouble();
        return angulo;
    }
    
    //CALCULO E IMPRESION DEL SENO, COSENO Y TANGENTE DEL ANGULO INGRESADO
    public static void calculoResultados(double angulo){
        double base, seno, coseno, tangente;
        base = Math.toRadians(angulo);
        seno = Math.sin(base);
        coseno = Math.cos(base);
        tangente = Math.tan(base);
        System.out.println("El seno es igual a: " + seno);
        System.out.println("El coseno es igual a: " + coseno);
        System.out.println("La tangente es igual a: " + tangente);
    }
}
