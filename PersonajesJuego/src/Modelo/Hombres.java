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
public class Hombres extends Personaje{
    
    public Hombres(){
        this.Raza="Humano";
        this.setLinkImag("/Imagenes/Humano.jpg");
    }
    
    @Override
    public void setFuerza(){
        this.fuerza=(int)Math.floor(Math.random()*85+50);
    }
    
    @Override
    public void setInteligencia(){
        this.inteligencia=(int)Math.floor(Math.random()*85+45);
    }
    
    @Override
    public void setAgilidad(){
        this.agilidad=(int)Math.floor(Math.random()*70+40);
    }
    
    @Override
    public void SetAltura(){
        this.altura=(int)Math.floor(Math.random()*40+160);
    }
    
    @Override
     public void setEdad(){
         this.Edad=(int)Math.floor(Math.random()*40+18);
    } 
     
     @Override
    public void setArmor(){
        int porcentaje=(int)Math.floor(Math.random()*99+1);
        this.Armor=porcentaje; 
        
        if(porcentaje>0&&porcentaje<41){
            this.setLinkArmor("/Imagenes/ArmHumano1.png");
        }else if(porcentaje>40&&porcentaje<71){
            this.setLinkArmor("/Imagenes/ArmHumano2.png");
        }else if(porcentaje>70){
            this.setLinkArmor("/Imagenes/ArmHumano3.png");
        }
    }
}
