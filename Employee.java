/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceabstract;

/**
 *
 * @author Asus
 */
public abstract class Employee implements payable{
    
  private String firstName;
  private String lastName; 
  private String socialSecurityNumber;
  
  public void setFirstName(String firstName)
  {
      this.firstName=firstName;
  }
  public String getFirstName()
  {
      return firstName;
  }
  
  public void setLastName(String lastName)
  {
      this.lastName=lastName;
  }
   public String getLastName()
  {
      return lastName;
  }
   
   public void setsocialSecurityNumber(String socialSecurityNumber)
  {
      this.socialSecurityNumber=socialSecurityNumber;
  } 
    public String getsocialSecurityNumber()
  {
      return socialSecurityNumber;
  }
    
}