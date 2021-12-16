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
public class Arma {
    protected String Nombre;
    protected String Tipo;
    protected String Alcance;
    protected int Potencia;
    protected String LinkIma;

    public String getLinkIma() {
        return LinkIma;
    }

    public void setLinkIma(String LinkIma) {
        this.LinkIma = LinkIma;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public String getAlcance() {
        return this.Alcance;
    }

    public int getPotencia() {
        return this.Potencia;
    }

    
    public void calPower() {}

  
}
