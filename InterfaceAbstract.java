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
public class InterfaceAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Invoice iv= new Invoice();
        
        
        CommissionEmployee commissionE1 = new CommissionEmployee();
        CommissionEmployee commissionE2 = new CommissionEmployee();
        CommissionEmployee commissionE3 = new CommissionEmployee();
        CommissionEmployee commissionE4 = new CommissionEmployee();
        CommissionEmployee commissionE5 = new CommissionEmployee();
        commissionE1.setFirstName("Abdul");
        commissionE1.setLastName("Ahmed");
        
         commissionE2.setFirstName("Jahid");
        commissionE2.setLastName("Ahmed");
        commissionE2.setgrossSales(30);
        commissionE2.setCommissoinrate(20);
        
        
        commissionE1.setgrossSales(30);
        commissionE1.setCommissoinrate(50);
        System.out.println("Total payment of "+commissionE1.getFirstName()+" "+commissionE1.getLastName()+" is "+commissionE1.getPaymentamount());
        
         System.out.println("Total payment of "+commissionE2.getFirstName()+" "+commissionE2.getLastName()+" is "+commissionE2.getPaymentamount());
    }
    
}