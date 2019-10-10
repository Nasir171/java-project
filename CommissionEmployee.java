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
public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissoinrate;
    
    public void setgrossSales(double grossSales)
    {
        this.grossSales=grossSales;
    }
    public double getgrossSales()
    {
        return grossSales;
    }
    
     public void setCommissoinrate(double commissoinrate)
    {
        this.commissoinrate=commissoinrate;
    }
    public double getcommissionrate()
    {
        return commissoinrate;
    }
    
    public double getPaymentamount(){
       double totalsales=this.getgrossSales()*this.getcommissionrate();
       return totalsales;
    }   
}