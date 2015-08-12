/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortlistapp;

/**
 *
 * @author Christina
 */
public class Student implements Comparable  

{
    
    private String firstName="";
    private String lastName="";
    private int score=0;
    
    // Student Class constructor
    public Student(String firstName, String lastName, int score)
    
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

  
    @Override
    public int compareTo(Object t)
    {
        Student s =(Student) t;
   
        // compares the array  and return the result
        if(lastName.equals(s.lastName))
        {
            return firstName.compareToIgnoreCase(s.firstName);
        }
        return lastName.compareToIgnoreCase(s.lastName);
 
    }
    
  
   // returns first Name  
    public String getfirstName()
    {
      return firstName;  
    }
    

    // Returns Last Name
    public String getlastName()
    {
        return lastName;
    }

    // Returns Student Score
    public int getScore()
    {
        return score;
    }

}