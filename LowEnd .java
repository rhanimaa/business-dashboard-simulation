
public class LowEnd extends Product{
	
	//High end products will have a lower Discount Rate and A higher Margin

	
	public LowEnd() {
    	
    }
    
    public LowEnd(String stockname, double price, int quant){
   	 
    	super(stockname, price, quant);
    	this.setRetailPrice();
    	
    }
	

    public double getRetailPrice() {return retailprice;}
    public void setRetailPrice() {this.retailprice = getCostprice()*2;}

    
    public String toString() {
    	return "Stock Name: " + this.getName() + ", Price: " + this.getCostprice() + ", Quantity: " + this.getQuantity() + ", Retail Price: " + getRetailPrice();
    }
    
    /**
     * Applies discretionary 5% discount to low end products
     */
    @Override
    public double discount() {
    	return 0.05 * this.getRetailprice();
    }
}

