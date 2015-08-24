/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roshamboapp;

/**
 *
 * @author Christina
 */
public enum Roshambo 

{
    ROCK,   
    PAPER,   
    SCISSORS;
    
   @Override
   public String toString(){
       if (this.ordinal() == 0)   return "Rock";
       if (this.ordinal() == 1)   return "Paper";
       if (this.ordinal() == 2)   return "Scissors";
       return "";   
    }    
}
