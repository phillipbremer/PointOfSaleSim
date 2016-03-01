/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psbdiscountstrategy;

/**
 *
 * @author Phillip Bremer
 */
public class Register {
    private Receipt receipt;
    private String storeName;
    private LineItem lineItem;
    private double grandTotal;
    private PrintReceipt print;
    
    public void startNewSale(String custId, DatabaseStrategy db){
        receipt = new Receipt(custId, db);
    }
    
    public final void addItemToSale(String prodId, int qty){
        receipt.addItemToReceipt(prodId, qty);
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }
    
    public final void setStoreName(String storeName) {
        //needs validation
        this.storeName = storeName;
    }
    
    public final void grandTotal(double grandTotal){
        //DO THE LOOP!... of some kind
        grandTotal = lineItem.getGrandSubtotal();
    }
    
    public final void endSale(){
        
    }
}
