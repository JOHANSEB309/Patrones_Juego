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
public class Personaje {
    protected String Raza;
    protected int altura;
    protected int fuerza;
    protected int agilidad;
    protected int inteligencia; 
    protected int Edad;
    protected int Armor;
    protected Arma Arma;
    private String LinkImag;
    private String ArmorLink;
    
    public String getLinkImag() {
        return LinkImag;
    }
    
    public String getLinkArmor(){
        return this.ArmorLink;
    }
    
    public void setLinkArmor(String ArmorLink){
        this.ArmorLink=ArmorLink;
    }
    
    public void setLinkImag(String LinkImag) {
        this.LinkImag = LinkImag;
    }

    
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public void setArma(Arma Arma) {
        this.Arma = Arma;
    }

    public String getRaza() {
        return this.Raza;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public int getAgilidad() {
        return this.agilidad;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public int getEdad() {
        return this.Edad;
    }

    public Arma getArma() {
        return this.Arma;
    }
    
    public void setFuerza(){}
    
    public void setAgilidad(){}
    
    public void setInteligencia(){}

    public void setEdad(){}

    public void SetAltura(){}
    
    public void setArmor(){}
    
    public String getLinkArma(){
        return Arma.getLinkIma();
    } 
    
    public int getPotencia(){
        return Arma.getPotencia();
    }
    
    public String getNombreArma(){
        return Arma.getNombre();
    }
    public String getAlcance(){
        return Arma.getAlcance();
    }
     public String getInfo(){
         String mensaje="que tiene una edad de "+this.Edad+"\n";
                 
        mensaje+="su altura es de: "+this.altura+" cm\n";
        mensaje+="tiene una fuerza de: "+this.fuerza+"\n";
        mensaje+="tiene una inteligencia de: "+this.inteligencia+"\n";
        mensaje+="tiene una agilidad de: "+this.agilidad+"\n";
        mensaje+="que posee un arma "+this.getNombreArma()+"\n con un daño de "+this.Arma.getPotencia();
        mensaje+="\nque porta una armadura de "+this.Armor+" de defensa";
        return mensaje;
     }
}
