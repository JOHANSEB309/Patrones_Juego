/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Johan Fontecha, Diana Ferraro, Andres Quintero
 */

public class Magos extends Personaje{    

    public Magos(){
        this.Raza="Mago";
        this.setLinkImag("/Imagenes/Mago.png");
    }
    
    @Override
    public void setFuerza(){
        this.fuerza=(int)Math.floor(Math.random()*40+15);
    }
    
    @Override
    public void setInteligencia(){
        this.inteligencia=(int)Math.floor(Math.random()*90+55);
    }
    
    @Override
    public void setAgilidad(){
        this.agilidad=(int)Math.floor(Math.random()*70+40);
    }
    
    @Override
    public void SetAltura(){
        this.altura=(int)Math.floor(Math.random()*190+160);
    }
    
    @Override
     public void setEdad(){
         this.Edad=(int)Math.floor(Math.random()*50+18);
     }
     
         public void setArmor(){
        int porcentaje=(int)Math.floor(Math.random()*99+1);
        this.Armor=porcentaje; 
        
        if(porcentaje>0&&porcentaje<41){
            this.setLinkArmor("/Imagenes/ArmMago1.png");
        }else if(porcentaje>40&&porcentaje<81){
            this.setLinkArmor("/Imagenes/ArmMago2.png");
        }else if(porcentaje>80){
            this.setLinkArmor("/Imagenes/ArmMago3.png");
        }
    }
}
