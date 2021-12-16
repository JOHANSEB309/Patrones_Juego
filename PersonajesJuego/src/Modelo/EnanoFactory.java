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
public class EnanoFactory extends CharacterFactory{
    
    public EnanoFactory(){
    }

    @Override
    public void setWeapon(){
        int porcentaje =(int)Math.floor(Math.random()*100+1); 
        
        if(porcentaje>0&&porcentaje<41){
            this.arma=new EspadaFactory();
        }else{
            this.arma=new MazaFactory();
        }
    }
    
    @Override
    public Personaje createCharacter(){
        this.person=new Enanos();
        this.setWeapon();
        this.SpefCharacter();
        return this.person;
    }
}
