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
public class BastonFactory extends WeaponFactory {
    
    public BastonFactory(){
        
    }

    @Override
    public Arma createWeapon() {
        this.weapon=new Bastones();
        this.forgeWeapon();
        return this.weapon;
    }
    
    
}
