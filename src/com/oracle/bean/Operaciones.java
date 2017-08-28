/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.bean;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diCenter
 */
public class Operaciones {
    
    public static void main(String... netec) {
        System.out.println(Operaciones.sumar(5,2,6,3,2));
        System.out.println(Operaciones.cobrarComisiones("Israel", 100,200,300));
        
    }
    
    public static int sumar(int... a){
    int resultado = 0;
    for(int i: a){
    resultado +=i;
        
    }
        return resultado;
    }
    
    public static Map<String,Double> cobrarComisiones(String vendedor, int ... ventas){
        double totalVentas = 0;
        for(int venta:ventas){
            totalVentas+=venta;
        }
        Map<String, Double> venta = new HashMap<String, Double>();
        venta.put(vendedor, totalVentas);
        return venta;
    }

    
}
