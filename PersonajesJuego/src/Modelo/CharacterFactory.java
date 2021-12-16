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
public abstract class CharacterFactory {
    
    protected Personaje person;
    protected WeaponFactory arma;
    
    public CharacterFactory(){
        
    }
    
    public void SpefCharacter(){
        
        this.person.SetAltura();
        this.person.setAgilidad();
        this.person.setEdad();
        this.person.setFuerza();
        this.person.setInteligencia();
        this.person.setArmor();
        this.person.setArma(this.arma.createWeapon());
    }
    
    public abstract void setWeapon();
    
    
  
    public abstract Personaje createCharacter();
    
}
