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
public class Elfos extends Personaje{
    
    public Elfos(){
        this.Raza="Elfo";
        this.setLinkImag("/Imagenes/Elfo.jpg");
    }
    
    @Override
    public void setFuerza(){
        this.fuerza=(int)Math.floor(Math.random()*85+40);
    }
    
    @Override
    public void setInteligencia(){
        this.inteligencia=(int)Math.floor(Math.random()*70+55);
    }
    
    @Override
    public void setAgilidad(){
        this.agilidad=(int)Math.floor(Math.random()*90+60);
    }
    
    @Override
    public void SetAltura(){
        this.altura=(int)Math.floor(Math.random()*210+185);
    }
    
    @Override
    public void setEdad(){
         this.Edad=(int)Math.floor(Math.random()*320+20);
     }       
    
    @Override
    public void setArmor(){
        int porcentaje=(int)Math.floor(Math.random()*99+1);
        this.Armor=porcentaje; 
        
        if(porcentaje>0&&porcentaje<41){
            this.setLinkArmor("/Imagenes/ArmElfo1.png");
        }else if(porcentaje>40&&porcentaje<81){
            this.setLinkArmor("/Imagenes/ArmElfo3.png");
        }else if(porcentaje>80){
            this.setLinkArmor("/Imagenes/ArmElfo2.png");
        }
    }
    
}
