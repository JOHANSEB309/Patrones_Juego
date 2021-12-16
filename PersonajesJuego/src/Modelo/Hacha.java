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
public class Hacha extends Arma{
    
    public Hacha(){
        this.Tipo="Hacha";
        this.Alcance="de Corto a mediano alcance";
    }
    
    @Override
    public void calPower(){
        int eleccion;
        eleccion=(int)Math.floor(Math.random()*4+1);
         
        switch(eleccion){
            case 1:
                this.Nombre="Hacha a dos manos";
                this.setLinkIma("/Imagenes/Hacha1.png");
                this.Potencia=(int)Math.floor(Math.random()*70+30); 
                break;
            
            case 2:
                this.Nombre="Hacha Demoniaca";
                this.setLinkIma("/Imagenes/Hacha3.png");
                this.Potencia=(int)Math.floor(Math.random()*85+50);   
                 break;
            
            case 3:
                this.Nombre="Hacha barbuda de gimil";
                this.setLinkIma("/Imagenes/Hacha2.png");
                this.Potencia=(int)Math.floor(Math.random()*65+50);   
                break;
            case 4:
                this.Nombre="Hacha escamas de dragon";
                this.setLinkIma("/Imagenes/Hacha4.png");
                this.Potencia=(int)Math.floor(Math.random()*75+60);   
                break;
                
            default:
                this.Nombre="Hacha escamas de dragon";
                this.setLinkIma("/Imagenes/Hacha4.png");
                this.Potencia=(int)Math.floor(Math.random()*75+60);   
                break;
        }     
    }
}
