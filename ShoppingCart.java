/**
 * The class models an online shopping cart.
 *
 * Step 1: Enter your name and a date
 * @author: Felix Estay-Foix  
 * @version: 09/15/2020 
 */
public class ShoppingCart
{
    // Step 2: Declare an instance variable
    private double subTotal;
    
    // Step 3: Write a constructor
    /**
     * Constructs an object of class ShoppingCart by
     * initializing the instance variable.
     */
    public ShoppingCart(double subTotalParam)
    {
        subTotal = subTotalParam;
        subTotalParam = 0.00;
    }    
    
    
    // Step 4: Write method add() as a stub
    /**
     * Adds the cost of a product to this shopping cart.
     *
     * @param cost the cost of the product
     */
    public void add(double cost)
    {
        subTotal = subTotal + cost;
    }
    
    // Step 5: Write method remove() as a stub
    /**
     * Removes the cost of a product from this shopping cart.
     * 
     * @param cost the cost of a product
     */
    public void remove(double cost)
    {
        subTotal = subTotal - cost;
    }
    
    // Step 6: Write method getSubtotal()
    /**
     * Returns the subtotal of all products in this shopping cart.
     * 
     * @return the subtotal of this shopping cart
     */
    public double getSubtotal()
    {
        return subTotal;
    }

    
}