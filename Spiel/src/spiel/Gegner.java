/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiel;

/**
 *
 * @author leon.effenberger
 */
public class Gegner {
    int gesundheit=5;
    
    private void Sterbe(){
    if(gesundheit==0){
        System.out.println("Du bist Tot.");
    
    }
        
    
    }
    
    public void nimmSchaden(int waffenstärke){
        
        gesundheit= gesundheit - waffenstärke;
        
   }
    
}
