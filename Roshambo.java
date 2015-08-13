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
    public String toString()
    {
       String s = "";
       if (this.ordinal()==0)
           s = "Rock";
       else if (this.ordinal()==1)
           s = "Paper";
       else if (this.ordinal()==2)
           s = "Scissors";
       return s;       
    }    
}
