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
public class Bastones extends Arma {
    
    public Bastones(){
        this.Alcance="de largo alcance";
        this.Tipo="Baston";
        
    }
    
    @Override
    public void calPower(){
        int porcentaje=0;
        
        porcentaje=(int) Math.floor(Math.random()*100+1);
        
        if(porcentaje>0&&porcentaje<51){
            this.Nombre="Baston de la fuerza de la naturaleza";
            this.setLinkIma("/Imagenes/Baston2.png");
            this.setLinkIma("/Imagenes/Baston1.png");
            this.Potencia=(int)Math.floor(Math.random()*65+30);
        }else if(porcentaje>50&&porcentaje<76){
            this.Nombre="Baston Thranduil";

            this.setLinkIma("/Imagenes/Baston2.png");
            this.Potencia=(int)Math.floor(Math.random()*80+50);
        }else if(porcentaje>75){
            this.Nombre="Gold Harmony";
            this.setLinkIma("/Imagenes/Baston2.png");
            this.setLinkIma("/Imagenes/Baston3.png");
            this.Potencia=(int)Math.floor(Math.random()*80+50);
        }
    }
    
}
