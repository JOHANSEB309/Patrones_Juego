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

public class Arco extends Arma{
    
    public Arco(){
        this.Tipo="Arco";
        this.Alcance="Mediano a largo Alcance";
    }
    
    @Override
    public void calPower(){
        
        int porcentaje=0;
        porcentaje=(int) Math.floor(Math.random()*100+1);
        
        if(porcentaje>51&&porcentaje<72){
            this.Nombre="Arco largo";
            this.setLinkIma("/Imagenes/Arco1.png");
            this.Potencia=(int)Math.floor(Math.random()*70+40);
        }else if(porcentaje>0&&porcentaje<50){
            this.Nombre="Arco Belthronding";
            this.Potencia=(int)Math.floor(Math.random()*55+15);
            this.setLinkIma("/Imagenes/Arco3.png");
        }else if (porcentaje>72){
            this.Nombre="Arco de Bregor";
            this.Potencia=(int)Math.floor(Math.random()*65+30);
            this.setLinkIma("/Imagenes/Arco2.png");
        }
    }
}
