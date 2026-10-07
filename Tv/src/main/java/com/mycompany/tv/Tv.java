/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tv;
/**
 *
 * @author yimid
 */
public class Tv {

    String marca;
    int pulgadas;
    boolean encedido;
    int volumen;
    
    
    public Tv(){
        
    }
    
    public Tv(String marca, int pulgadas, boolean encendido, int volumen){
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.encedido = encendido;
        this.volumen = volumen;
    }
    public boolean encender(){
        System.out.println("la tv se esta encendiendo");
        return this.encedido = true;
    }
    public boolean apagar(){
        System.out.println("la tv se esta apagando");
        
        return this.encedido = false;
    }
    public int subirVolumen(){
       System.out.println("Subiendo Volumen...");
       return this.volumen +=5;
    }

    public int bajarVolumen(){
        System.out.println("Bajando Volumen...");
        return this.volumen -=5;
    }

}
