/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roshamboapp;

//Player abstract class 
public abstract class Player
{
    
    public String name;
    public String response;

    public Player() {}
    
    //set method for name
    public void setName(String name)
    {
        this.name = name;
    }
    
    //get method for name
    public String getName()
    {
        return name;
    }
    
    //set method for response
    public void setResponse(String response)
    {
        this.response = response;
    }
    
    //get method for response
    public String getResponse()
    {
        return response;
    }
    
    //abstract method that allows an inheriting class 
    //to generate and return a Roshambo value
    public abstract Roshambo generateRoshambo();    
}
