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
public abstract class WeaponFactory {
    
    Arma weapon;
    
    public WeaponFactory(){   
    }
    
    public void forgeWeapon(){
        this.weapon.calPower();
    }
     
    public abstract Arma createWeapon();
    
}
