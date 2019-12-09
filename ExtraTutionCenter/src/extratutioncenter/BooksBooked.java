/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extratutioncenter;

/**
 *
 * @author shiva
 */
class BooksBooked {
    public String Subject;
    public int quantity;

    public BooksBooked( String Subject, int quantity) {
        this.Subject = Subject;
        this.quantity = quantity;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
