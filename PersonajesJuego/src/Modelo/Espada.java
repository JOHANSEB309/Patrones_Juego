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
public class Espada extends Arma{
    public Espada(){
        this.Tipo="Espada";
        this.Alcance="corto alcance";
    }
    
    @Override
    public void calPower(){
        int eleccion;
        eleccion=(int)Math.floor(Math.random()*100+1);           
        if(eleccion>0&&eleccion<56){
            this.Nombre="Espada corta Narsil";
            this.setLinkIma("/Imagenes/Espada2.png");
            this.Potencia=(int)Math.floor(Math.random()*40+15);
        }else if(eleccion>55&&eleccion<86){
            this.Nombre="Espada Anduril";
                            this.Potencia=(int)Math.floor(Math.random()*75+40);
            this.setLinkIma("/Imagenes/Espada3.png");
        }else if(eleccion>85){
            this.Nombre="Espada Elfica Orcist";
            this.Potencia=(int)Math.floor(Math.random()*90+60);
            this.setLinkIma("/Imagenes/Espada1.png");
        }
   
    }
    
}
