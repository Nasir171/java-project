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
public class HourlyEmployee {
    private double wage;
   private double hours;
   
   public void setwage(double wage)
   {
       this.wage=wage;
   }
   public double getwage()
   {
       return wage;
   }
   
   public void sethours(double hours)
   {
       this.hours=hours;
   }
   public double gethours()
   {
       return hours;
   }
   
   public double getPaymentamount()
   {
       double totalhour=this.getwage()*this.gethours();
       return totalhour;
   }
}