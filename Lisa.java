/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roshamboapp;

import java.util.Random;

public class Lisa extends Player 
{
    public Lisa()
    {
        name = "Lisa";
    }

    /**
     *
     * @return
     */
    @Override
    public Roshambo generateRoshambo()
    {              
        //randomly selects rock,paper, or scissors 
        //(a one in three chance)
        
       Random r=new Random();
       int ch=r.nextInt(3);
       if(ch==0) return Roshambo.ROCK;
       else if(ch==1) return Roshambo.PAPER;
       else return Roshambo.SCISSORS;
    }
}
