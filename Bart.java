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

//inherit the Player class
public class Bart extends Player
{
    public Bart()
    {
        name = "Bart";
    }
     
    //implements the generateRoshambo method from the Player class
    @Override
    public Roshambo generateRoshambo()
    {     
       return Roshambo.ROCK;    
    }
}
