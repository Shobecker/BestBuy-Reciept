/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tax;

import Items.PurchasedItems;
import java.util.Date;

/**
 *
 * @author Elias
 */
public class CATaxComputation extends TaxComputationMethod {

    @Override
    public double computeTax(PurchasedItems items, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean taxHoliday(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
