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
public class SalariedEmployee {
    
    private double weeklySalary;
    
    public void setweeklysalaries( double weeklysalary)
    {
        this.weeklySalary=weeklysalary;
    }
    public double getweekSalaries()
    {
        return weeklySalary;
    }
    
    public double getPaymentamount()
    {
        double totalpayment=this.getweekSalaries()*4;
        return totalpayment;
    }
}

    

