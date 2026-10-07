/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tv;

/**
 *
 * @author yimid
 */
public class prueba {
    public static void main(String[] args){
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();
        
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;
        
        tv2.marca = "Sony";
        tv2.pulgadas = 35;
        tv2.volumen = 50;
        
        tv3.marca = "LG";
        tv3.pulgadas = 70;
        tv3.volumen = 100;
        
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
        
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
        
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}
