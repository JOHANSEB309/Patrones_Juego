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
public class HumanoFactory extends CharacterFactory {
    
    public HumanoFactory(){
        
    }
    
    @Override
    public void setWeapon(){
        int porcentaje =(int)Math.floor(Math.random()*100+1); 
        
        if(porcentaje>0&&porcentaje<34){
            this.arma=new HachaFactory();
        }else if(porcentaje>33&&porcentaje<67){
            this.arma=new ArcoFactory();
        }else{
            this.arma=new EspadaFactory();
        }
    }
    
    @Override
    public Personaje createCharacter() {
        this.person=new Hombres();
        this.setWeapon();
        this.SpefCharacter();
        return this.person;
    }
}
