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
public class Enanos extends Personaje{
    
    public Enanos(){
        this.Raza="Enano";
        this.setLinkImag("/Imagenes/Enano.jpg");
    }
    
        @Override
    public void setFuerza(){
        this.fuerza=(int)Math.floor(Math.random()*50+20);
    }
    
    @Override
    public void setInteligencia(){
        this.inteligencia=(int)Math.floor(Math.random()*60+35);
    }
    
    @Override
    public void setAgilidad(){
        this.agilidad=(int)Math.floor(Math.random()*80+40);
    }
    
    @Override
    public void SetAltura(){
        this.altura=(int)Math.floor(Math.random()*35+100);
    }
    
    @Override
     public void setEdad(){
         this.Edad=(int)Math.floor(Math.random()*178+30);
     } 
     
     @Override
    public void setArmor(){
        int porcentaje=(int)Math.floor(Math.random()*99+1);
        this.Armor=porcentaje; 
        
        if(porcentaje>0&&porcentaje<60){
            this.setLinkArmor("/Imagenes/ArmEnano1.png");
        }else if(porcentaje>60&&porcentaje<86){
            this.setLinkArmor("/Imagenes/ArmEnano2.png");
        }else if(porcentaje>85){
            this.setLinkArmor("/Imagenes/ArmEnano3.png");
        }
    }
}
