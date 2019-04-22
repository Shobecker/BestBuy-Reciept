/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receipt;

import Tax.TaxComputationMethod;
import java.util.Date;
import Items.PurchasedItems;

/**
 *
 * @author Elias
 */
public class BasicReceipt implements Receipt {

    private StoreHeader store_header; // street address, state code, phone number, store number
    private TaxComputationMethod tc;
    private Date date; // may also be a String type
    private PurchasedItems items;

    public BasicReceipt() { 
    }

    public BasicReceipt(PurchasedItems items, Date date) { // Date may also be a String type
        this.items = items;
        this.date = date;
    }

    public void setStoreHeader(StoreHeader h) {
        store_header = h;
    }
    
    //sets tax to specfic state
    public void setTaxComputationMethod(TaxComputationMethod tc) {
        this.tc = tc;
    }

    private double subTotalCosts() {
        return items.getTotalCost();
    }

    private double setTax() {
        return subTotalCosts() * tc.computeTax(items, date);
    }
    
    private TaxComputationMethod getTaxComputation(){
        return tc;
    }

    @Override
    public void prtReceipt() {
        //to implement
        //Store Header
        System.out.println("Best Buy");
        System.out.println(store_header.toString());
        System.out.println("");
        //Date of Sale
        System.out.println("Date of Sale: " + this.date);
        System.out.println("");
        //Itemized Purchases
        items.printItems();
        System.out.println("");
        //Total Sales (without sales tax)
        System.out.println("Total Sales: " + subTotalCosts());
        //Amount Due (with added sales tax)
        System.out.println("Total Cost: " + subTotalCosts() + setTax());

    }
}
