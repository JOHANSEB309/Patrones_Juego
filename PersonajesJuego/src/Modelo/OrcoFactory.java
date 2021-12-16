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
public class OrcoFactory extends CharacterFactory {
    
    public OrcoFactory(){
        
    }

    @Override
    public void setWeapon(){
        
        int porcentaje =(int)Math.floor(Math.random()*100+1); 
        
        if(porcentaje<51){
            this.arma=new HachaFactory();
                    
        }else{
            this.arma=new MazaFactory();
        }
    }
    
    @Override
    public Personaje createCharacter() {
        this.person=new Orcos();
        this.setWeapon();
        this.SpefCharacter();
        return this.person;
    }
    
    
}
