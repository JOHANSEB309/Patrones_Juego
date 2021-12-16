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
public class Mazas extends Arma{
    
    public Mazas(){
        this.Alcance="Corto alcance";
        this.Tipo="Maza";
        
    }
    
    public void calPower(){
        int porcentaje=0;
        
        porcentaje=(int) Math.floor(Math.random()*100+1);
        
        if(porcentaje>0&&porcentaje<51){
           this.Nombre="Maza de guerra"; 
           this.setLinkIma("/Imagenes/Maza2.png");
           this.Potencia=(int)Math.floor(Math.random()*55+20);
        }else if(porcentaje>50&&porcentaje<83){
            this.Nombre="martillo pesado"; 
            this.setLinkIma("/Imagenes/Maza3.png");
            this.Potencia=(int)Math.floor(Math.random()*65+30);
        }else if(porcentaje>83){
            this.Nombre="martillo de guerra"; 
            this.setLinkIma("/Imagenes/Maza1.png");
            this.Potencia=(int)Math.floor(Math.random()*85+50);
        }
    }
    
}
