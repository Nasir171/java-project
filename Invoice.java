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
public class Invoice implements payable{
    
     private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerltem;
    
    public void setPartNumber(String partNumber)
    {
        this.partNumber=partNumber;
    }
    public String getPartNumber()
    {
        return partNumber;
    }
    
    public void setPartDescription(String partDescription)
    {
        this.partDescription=partDescription;
    }
    public String getPartDescription()
    {
        return partDescription;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setPricePerltem(double pricePerltem)
    {
        this.pricePerltem=pricePerltem;
    }
    public double getpricePerltem()
    {
        return pricePerltem;
    }
    
    public double getPaymentamount()
    {
        double totalBill=this.getpricePerltem()*this.getQuantity();
        return totalBill;
    }
}

    

