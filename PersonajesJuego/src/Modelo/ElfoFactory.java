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
public class ElfoFactory extends CharacterFactory{
    
    public ElfoFactory(){
        
    }

    @Override
    public void setWeapon() {
       int porcentaje =(int)Math.floor(Math.random()*100+1); 
       
       if(porcentaje>0&&porcentaje<61){
           this.arma=new ArcoFactory();
       }else{
           this.arma=new EspadaFactory();
       }
    }

    @Override
    public Personaje createCharacter() {
        this.person=new Elfos();
        this.setWeapon();
        this.SpefCharacter();
        return this.person;
    }    
    
}
