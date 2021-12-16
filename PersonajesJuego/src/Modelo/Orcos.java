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
public class Orcos extends Personaje{
    
    public Orcos(){
        this.Raza="Orco";
        this.setLinkImag("/Imagenes/Orco.jpg");
    }
    
    @Override
    public void setFuerza(){
        this.fuerza=(int)Math.floor(Math.random()*80+40);
    }
    
    @Override
    public void setInteligencia(){
        this.inteligencia=(int)Math.floor(Math.random()*50+10);
    }
    
    @Override
    public void setAgilidad(){
        this.agilidad=(int)Math.floor(Math.random()*85+50);
    }
    
    @Override
    public void SetAltura(){
        this.altura=(int)Math.floor(Math.random()*170+100);
    }
    
    @Override
     public void setEdad(){
         this.Edad=(int)Math.floor(Math.random()*50+20);
     } 
    
         public void setArmor(){
        int porcentaje=(int)Math.floor(Math.random()*99+1);
        this.Armor=porcentaje; 
        
        if(porcentaje>0&&porcentaje<51){
            this.setLinkArmor("/Imagenes/ArmOrco3.png");
        }else if(porcentaje>50&&porcentaje<91){
            this.setLinkArmor("/Imagenes/ArmOrco1.png");
        }else if(porcentaje>90){
            this.setLinkArmor("/Imagenes/ArmOrco2.png");
        }
    }
}
