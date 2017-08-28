/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.test;

import com.oracle.bean.Persona;



/**
 *
 * @author diCenter
 */
public class TestPersona {
    
    public static void main(String... oracle){
        Persona saul = new Persona("Saul",20,'M');
        Persona veronica = new Persona("Veronica",22,'F');
        
                
        saul.comer("camarones","pizza","ostiones");
        veronica.comer("ensalada","tacos al pastor");
        
        Persona hijo=saul.reproducirse(veronica);
        System.out.println(hijo);
        System.out.println(hijo.getNombre());
        System.out.println(hijo.getSexo());
        System.out.println(hijo.getMadre().getNombre());
        System.out.println(hijo.getPadre().getNombre());
        
    }
    
}
