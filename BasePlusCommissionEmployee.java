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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
      public double getPaymentamount()
          
      {
           double totalsalary=this.getBaseSalary()+this.getcommissionrate();
               return totalsalary;
      }
    
}
